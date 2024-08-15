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
    System.out.println("\nMap:");
    pessoas.stream()
        .map(p -> p.getIdade())
        .forEach(p -> System.out.println(p));

    // Sorted
    System.out.println("\nSorted:");
    pessoas.stream()
        .sorted((a, b) -> a.getNome().compareTo(b.getNome()))
        .forEach(p -> System.out.println(p));

    // Distinct
    System.out.println("\nDistinct:");
    pessoas.stream()
        .distinct()
        .forEach(p -> System.out.println(p));

    // Limit
    System.out.println("\nLimit:");
    pessoas.stream()
        .limit(2)
        .forEach(p -> System.out.println(p));

  }

}
