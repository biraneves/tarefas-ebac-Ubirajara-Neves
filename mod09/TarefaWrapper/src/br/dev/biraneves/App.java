package br.dev.biraneves;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numeral inteiro: ");
        int valorEntrada = scanner.nextInt();
        Integer valorSaida = Integer.valueOf(valorEntrada);

        scanner.close();

        System.out.println("O valor da variável Wrapper é: " + valorSaida);

    }
}
