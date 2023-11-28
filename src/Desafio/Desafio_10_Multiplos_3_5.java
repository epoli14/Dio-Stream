package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio_10_Multiplos_3_5 {

    /**
     * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
     * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 45, 21, 60);

        Consumer<Integer> multiplos = numero -> {
          if ((numero % 3 == 0) && (numero % 5 == 0)){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(multiplos);

    }
}
