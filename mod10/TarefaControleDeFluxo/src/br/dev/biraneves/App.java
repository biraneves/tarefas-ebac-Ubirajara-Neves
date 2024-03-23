package br.dev.biraneves;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Float nota1;
        Float nota2;
        Float nota3;
        Float nota4;
        Float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.println("Informe a quarta nota: ");
        nota4 = scanner.nextFloat();

        scanner.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

    }
}
