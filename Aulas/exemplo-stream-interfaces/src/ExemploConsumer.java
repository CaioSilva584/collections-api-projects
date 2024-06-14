import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        // Cria uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {   // "numero" aqui, é o argumento
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

        // Forma esquivalente
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    System.out.println(integer);
                }
            }
        });


        // Mais uma forma de representar
        numeros.forEach(n -> {    // Como ele não é tipado, não é necessário informar o tipo
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        // Utilizando filter e predicate para deixar mais enxuto
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
