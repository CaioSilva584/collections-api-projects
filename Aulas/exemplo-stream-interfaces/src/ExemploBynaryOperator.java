import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBynaryOperator {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usa um BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> soma = (numero1, numero2) -> numero1 + numero2; // Pode ser feito por Method reference (Integer :: sum)

        // Atribui a soma a uma variável utilizando a expressão no reduce
        int resultado = numeros.stream()
                .reduce(1, soma);
        // Mesma operação utilizando Method Reference
        int resultado2 = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprime o resultado
        System.out.println(resultado);



        // Funciona, mas desnecessário salvar o resultado em uma List kkkkkkkkkkkkkkkk
        List<Integer> resultadoList = numeros.stream()
                .reduce(soma)
                .stream()
                .toList();

        resultadoList.forEach(System.out::println);

    }
}
