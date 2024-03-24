package br.dev.biraneves;

public abstract class Pessoa {
    
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
