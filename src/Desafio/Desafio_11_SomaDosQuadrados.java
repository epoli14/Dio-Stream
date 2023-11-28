package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio_11_SomaDosQuadrados {

    /**
     * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
     * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
     */

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(5, 4, 3);

        BinaryOperator<Integer> quadrado = (num1, num2) -> num1 * num1 + num2 * num2 ;

        int somaDosQuadrados = numeros.stream().reduce(0, quadrado);
        System.out.println(somaDosQuadrados);



    }
}
