import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class FunctionExample {

    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
     */

    public static void main(String[] args) {

        List <Integer> numeros = ConsumerExample.gerarNumerosInteiros(10);

        //Usar a Function com empressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);

    }

    public static List<Integer> gerarNumerosInteiros(int sizeLista) {
        Random random = new Random();
        List<Integer> randomIntegers = new ArrayList<>();

        for (int i = 0; i < sizeLista; i++) {
            randomIntegers.add(random.nextInt(1, 30));
        }
        System.out.println(randomIntegers);
        return randomIntegers;
    }

}
