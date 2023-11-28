package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio_08_Somar_lista {

    /**
     * Desafio 8 - Somar os dígitos de todos os números da lista:
     * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        int resultadoSoma = numeros.stream().reduce(0, soma);

        System.out.println(resultadoSoma);

    }
}
