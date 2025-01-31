package br.dev.biraneves.mod23;

import java.util.List;
import java.util.Scanner;

public class TarefaStreams {

    private static List<Pessoa> getEntradas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome e sexo separado por hífen, cada par separado do outro por vírgula: ");
        String entrada = scanner.nextLine();

        scanner.close();

        // Como não foi solicitado, não foram feitas limpezas ou validações.
        // Supões-se, portanto, que a entrada é válida.

        List<String> entradas = List.of(entrada.split(","));
        return entradas.stream()
                .map(p -> new Pessoa(p.split("-")[0].trim(), p.split("-")[1].trim()))
                .toList();
    }

    // Como quero escrever teste unitário aqui, preciso refatorar o código.
    // Extraí, portanto, a lógica para retornar uma lista de pessoas do sexo feminino.

    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .toList();
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = getEntradas();
        List<Pessoa> mulheres = filtrarMulheres(pessoas);

        System.out.println("Pessoas informadas\n------------------");
        pessoas.stream()
                .forEach(System.out::println);

        System.out.println("\nPessoas do sexo feminino\n------------------------");
        mulheres.stream()
                .forEach(System.out::println);
    }

}
