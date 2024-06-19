import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long qtdeNegativos = numeros.stream()
                .filter(n -> n < 0)
                .count();

        System.out.println(qtdeNegativos > 0);
    }
}