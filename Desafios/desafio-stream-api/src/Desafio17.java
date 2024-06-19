import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> primo = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                int aux = integer;
                if (integer == 2) {
                    return true;
                }

                if (integer == 1) {
                    return false;
                }

                for (int x = integer - 1; x >= 2; x--) {
                    if (integer % x > 0) {
                        aux = x;
                    } else {
                        return false;
                    }
                }

                return true;
            }
        };

        numeros.stream()
                .filter(primo)
                .forEach(System.out::println);
    }
}