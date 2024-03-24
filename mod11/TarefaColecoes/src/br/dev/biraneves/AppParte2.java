package br.dev.biraneves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppParte2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe nome e sexo separados por hífen, cada par separado do outro por vírgula: ");
        String entrada = scanner.nextLine();

        List<String> temp = new ArrayList<>(Arrays.asList(entrada.split(",")));
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String pessoa : temp) {
            if (pessoa.contains("-M")) {
                masculino.add(pessoa);
            } else if (pessoa.contains("-F")) {
                feminino.add(pessoa);
            } else {
                continue;
            }
        }

        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
 
    }

}
