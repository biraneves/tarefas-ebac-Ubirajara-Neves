package br.dev.biraneves.streams;

import java.util.List;

class Ex02 {

  public static void main(String[] args) {

    List<Pessoa> pessoas = Pessoa.populaPessoas();
    pessoas.stream().forEach(p -> System.out.println(p));

    // Filter
    System.out.println("\nFilter:");
    pessoas.stream()
        .filter(p -> p.getNacionalidade().equals("Brasil"))
        .forEach(p -> System.out.println(p));

    // Map
    System.out.println("\nMap");
    pessoas.stream()
        .map(p -> p.getIdade())
        .forEach(p -> System.out.println(p));

  }

}
