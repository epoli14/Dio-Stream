package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio_02 {

    /**
     * Desafio 2 - Imprima a soma dos números pares da lista:
     * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando predicate para filtrar os numeros pares
        Predicate<Integer> numerosPares = n -> (n % 2 == 0);

        //
        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream().filter(numerosPares).reduce(0, soma);

        System.out.println("Resultado da soma: " + resultado);

    }

}
