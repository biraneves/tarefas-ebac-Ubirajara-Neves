package br.dev.biraneves;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextFloat();

        scanner.close();

        CalculadoraMedia calculadora = new CalculadoraMedia(nota1, nota2, nota3, nota4);

        media = calculadora.calculaMedia();

        System.out.println("A sua média é: " + media);

    }
}
