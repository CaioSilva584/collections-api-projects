import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma seudação personalizada
        Supplier<String> saudacao = () -> "Boi nos dias";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();  // Equivalente ao .collect(Collector.toList())

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);    // Equivalente a passar (s -> System.out.println(s));

        // Forma alternativa: forma resumida
        List<String> listaSaudacoes2 = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Bom dia";
            }
        }).limit(5).toList();

        // Mais outra forma: com expressão lambda
        List<String> listaSaudacoes3 = Stream.generate(() -> "Bom dia"  // Expressão
                )
                .limit(5)
                .toList();
    }
}
