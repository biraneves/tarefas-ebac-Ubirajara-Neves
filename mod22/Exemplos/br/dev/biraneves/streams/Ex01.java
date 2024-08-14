package br.dev.biraneves.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Ex01 {

  public static void main(String[] args) {

    List<String> lista = List.of("Bira", "Neves");
    Stream<String> streamList = lista.stream();
    streamList.forEach(s -> System.out.println(s));

    Set<String> set = Set.of("Bira", "Neves");
    Stream<String> streamSet = set.stream();

    Map<String, String> map = Map.of("Bira", "Neves");
    Stream<String> streamMapKeys = map.keySet().stream();
    Stream<String> streamMapValues = map.values().stream();

    Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);
    IntStream numbersFromArrays = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });

    System.out.println();
    numbersFromValues.forEach(n -> System.out.println(n));

    System.out.println();
    numbersFromArrays.forEach(n -> System.out.println(n));

  }

}
