package br.dev.biraneves;

public class PessoaFisica extends Pessoa {
    
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Getters e setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + getCpf() + ", nome=" + getNome() + "]";
    }

}
