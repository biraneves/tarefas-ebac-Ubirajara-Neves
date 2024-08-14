package br.dev.biraneves.streams;

import java.util.List;

class Pessoa {

  private String id;
  private String nome;
  private String nacionalidade;
  private int idade;

  public Pessoa(String id, String nome, String nacionalidade, int idade) {
    this.id = id;
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
  }

  public String getId() {
    return id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public static List<Pessoa> populaPessoas() {
    Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", 18);
    Pessoa pessoa2 = new Pessoa("p2", "Hernandez Rojas", "México", 21);
    Pessoa pessoa3 = new Pessoa("p3", "John Doe", "Canadá", 22);
    Pessoa pessoa4 = new Pessoa("p4", "Manoel da Silva", "Brasil", 22);

    return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
  }

  @Override
  public String toString() {
    return "[" + id + "; " + nome + "; " + nacionalidade + "; " + idade + "]";
  }

}
