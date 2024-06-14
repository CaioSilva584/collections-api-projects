import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> linguagens = Arrays.asList("Java", "C", "C#", "Python", "Kotlin", "JavaScript");

        // Criar um predicate
        Predicate<String> temQuatroLetras = l -> l.length() >= 4;

        // Usar o stream para filtrar as palavras e imprimir as que passaram
        linguagens.stream()
                .filter(temQuatroLetras)
                .forEach(System.out::println);

        // Outra forma
        List<String> respostas = linguagens.stream()
                .filter(temQuatroLetras)
                .toList();

        respostas.forEach(System.out::println);

        // Mais uma forma diferente de fazer
        linguagens.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String l) {
                        return l.length() >= 4;
                    }
                })
                .forEach(System.out::println);

        // A forma mais curta utilizando lambda
        linguagens.stream()
                .filter(l -> l.length() >= 4)
                .forEach(System.out::println);
    }
}
