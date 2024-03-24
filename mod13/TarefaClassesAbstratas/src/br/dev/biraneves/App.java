package br.dev.biraneves;
public class App {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Bira Neves", "123.456.789-10");
        PessoaJuridica pj = new PessoaJuridica("Bira Neves MEI", "123.456.789/0001-10");

        System.out.println(pf);
        System.out.println(pj);

    }
}
