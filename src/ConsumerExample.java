import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConsumerExample {

    public static void main(String[] args) {

    List<Integer> numeros = gerarNumerosInteiros();




    }


    public static List<Integer> gerarNumerosInteiros(){
        Random random = new Random();
        List<Integer> randomIntegers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            randomIntegers.add(random.nextInt(1, 30));
        }
        return randomIntegers;
    }
}
