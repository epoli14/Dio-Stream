import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ConsumerExample {
    /**
     * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
     * retornar um valor.
     */
    public static void main(String[] args) {

        List<Integer> numeros = gerarNumerosInteiros(7);

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });


    }

    //Cria uma lista de números inteiros
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
