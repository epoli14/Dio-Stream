package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Desafio_05 {

    /**
     * Desafio 5 - Calcule a média dos números maiores que 5:
     * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Removendo numeros menores que cinco
        Predicate<Integer> removerMenorCinco = numero -> numero > 5;

        //Somando todos os números
        BinaryOperator<Integer> somandoMaiores = (n1, n2) -> n1 + n2;

        int len = numeros.stream().filter(removerMenorCinco).toArray().length;

        int resultado = numeros.stream().filter(removerMenorCinco).reduce(0, somandoMaiores);

        System.out.println("Média: " + resultado/len);


    }
}
