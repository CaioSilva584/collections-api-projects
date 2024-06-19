import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n < numeros.stream().max(Comparator.naturalOrder()).get())
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        // Outra forma de fazer
        numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // Apenas fazendo testes de conversão
        Stream<Integer> consulta = numeros.stream();
        IntStream conversao = consulta.mapToInt(Integer :: intValue);
        conversao.forEach(System.out::println);

        // Apenas anotando que cada operação da stream pode retornar um valor
        // exceto quando a operação é terminal, ou seja, retorna um void
    }
}