import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;   // Vantagem desta abordagem aqui é que a função fica armazenada em algum lugar

        // Usar a função para dobrar os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)    // Poderia passar também a expressao lambda direto aqui
                .toList();

        // Imprimir a lista de númeors dobrados
        numerosDobrados.forEach(System.out::println);

        // Outra forma de fazer
        List<Integer> numerosDobrados2 = numeros.stream()
                .map(new Function<Integer, Integer>() {

                    @Override
                    public Integer apply(Integer numero) {
                        return numero * 2;
                    }
                })    // Poderia passar também a expressao lambda direto aqui
                .toList();

        // Print com lambda
        numerosDobrados2.forEach(n -> System.out.println(n));
    }
}
