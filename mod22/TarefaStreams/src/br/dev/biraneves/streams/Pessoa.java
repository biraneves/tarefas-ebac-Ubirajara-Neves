package br.dev.biraneves.streams;

import java.util.Objects;

class Pessoa {

  private String nome;
  private String sexo;

  public Pessoa() {
  }

  public Pessoa(String nome, String sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return sexo;
  }

  @Override
  public int hashCode() {
    return nome != null && sexo != null ? Objects.hash(nome, sexo) : 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Pessoa outraPessoa = (Pessoa) obj;

    return nome != null && sexo != null ? nome.equals(outraPessoa.getNome()) && sexo.equals(outraPessoa.getSexo())
        : outraPessoa.getNome() == null && outraPessoa.getSexo() == null;
  }

  @Override
  public String toString() {
    return "Pessoa{nome = " + nome + "; sexo = " + sexo + "}";
  }

}
