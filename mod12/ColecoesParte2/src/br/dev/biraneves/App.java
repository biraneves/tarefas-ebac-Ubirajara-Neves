package br.dev.biraneves;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe nome e sexo separados por hífen, cada par separado do outro por vírgula: ");
        String entrada = scanner.nextLine();

        scanner.close();

        List<String> temp = Arrays.asList(entrada.split(","));
        Map<String, ArrayList<String>> map = new HashMap<>();

        map.put("F", new ArrayList<>());
        map.put("M", new ArrayList<>());

        temp.forEach(item -> {
            if (item.contains("-F")) {
                map.get("F").add(item);
            } else if (item.contains("-M")) {
                map.get("M").add(item);
            }
        });

        System.out.println(map.get("F"));
        System.out.println(map.get("M"));

    }
}
