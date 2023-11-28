package Desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Desafio_07_segundo_número_maior {

    /**
     * Desafio 7 - Encontrar o segundo número maior da lista:
     * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int secondHighest = numeros.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        System.out.println(secondHighest);

        int secondLowest = numeros.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println(secondLowest);

    }



}
