package br.dev.biraneves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppParte1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os nomes separados por vírgula: ");
        String entrada = scanner.nextLine();

        scanner.close();

        List<String> nomes = new ArrayList<>(Arrays.asList(entrada.split(",")));
        nomes.sort((String a, String b) -> a.compareTo(b));

        System.out.println(nomes);

    }
}
