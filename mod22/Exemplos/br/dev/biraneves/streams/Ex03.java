package br.dev.biraneves.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Ex03 {

  public static void main(String[] args) {

    // Operações terminais
    List<Pessoa> pessoas = Pessoa.populaPessoas();

    // ForEach
    System.out.println("\nForEach:");
    pessoas.stream().forEach(p -> System.out.println(p));

    // Count
    System.out.println("\nCount:");
    System.out.println(
        pessoas.stream()
            .filter(p -> p.getNome().startsWith("M"))
            .count());

    // AllMatch
    System.out.println("\nAllMatch:");
    System.out.println(
        pessoas.stream()
            .allMatch(p -> p.getNacionalidade().equals("México")));

    // Collect
    System.out.println("\nCollect:");
    List<Pessoa> brasileiros = pessoas.stream()
        .filter(p -> p.getNacionalidade().equals("Brasil"))
        .collect(Collectors.toList());
    System.out.println(brasileiros);

    // Optionals
    System.out.println("\nOptionals:");
    Optional<Pessoa> max = pessoas.stream()
        .max(Comparator.comparing(Pessoa::getIdade));
    max.ifPresent(System.out::println);
  }

}
