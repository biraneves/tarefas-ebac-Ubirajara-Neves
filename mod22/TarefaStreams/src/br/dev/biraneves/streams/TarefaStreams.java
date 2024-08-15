package br.dev.biraneves.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class TarefaStreams {

  private static List<Pessoa> getEntradas() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe nome e sexo separado por hífen, cada par separado do outro por vírgula: ");
    String entrada = scanner.nextLine();

    scanner.close();

    // Como não foi solicitado, não foram feitas limpezas ou validações.
    // Supõe-se, portanto, que a entrada é válida.

    List<String> entradas = List.of(entrada.split(","));
    return entradas.stream()
        .map(p -> new Pessoa(p.split("-")[0].trim(), p.split("-")[1].trim()))
        .toList();
  }

  public static void main(String[] args) {

    List<Pessoa> pessoas = getEntradas();
    List<Pessoa> mulheres = pessoas.stream()
        .filter(p -> p.getSexo().equals("F"))
        .toList();

    System.out.println("Pessoas informadas\n------------------");
    pessoas.stream()
        .forEach(System.out::println);

    System.out.println("\nPessoas do sexo feminino\n------------------------");
    mulheres.stream()
        .forEach(System.out::println);

  }

}
