import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {

        //Cria uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Python", "C#", "Kotlin", "Javascript", "C", "GO", "Ruby", "Lua");

        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        //Imprimir cada palavra que passou no filtro

        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}
