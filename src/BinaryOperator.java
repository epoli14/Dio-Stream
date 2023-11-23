import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryOperator {

    /**
     * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
     * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
     */

    public static void main(String[] args) {

        // Criar lista de números inteiros
        List<Integer> numeros = gerarNumeros(3);

        //BinaryOperator com expressão lambda para somar 2 números inteiros
        java.util.function.BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator para somar todos os números no Stream
        //int resultado = numeros.stream().reduce(0, soma);

        int resultado = numeros.stream().
                reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("O resultado é: " + resultado);

    }

    public static List<Integer> gerarNumeros(int len){

        Random random = new Random();
        List<Integer> novaLista = new ArrayList<>();

        for(int i = 0; i < len;i++){

            novaLista.add(random.nextInt(1,50));
        }
        System.out.println(novaLista);
        return novaLista;
    }
}
