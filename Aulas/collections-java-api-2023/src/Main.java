import main.java.list.OperacoesBasicas.ListaTarefa;
import main.java.list.OperacoesBasicas.Tarefa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaTarefa lista = new ListaTarefa();

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite uma tarefa para a lista: ");

            lista.adicionarTarefa(new Tarefa(scan.next()).getDescricao());
        }

        System.out.println(lista.obterNumeroTarefas());
        lista.imprimirLista();

        System.out.println("Digite uma categoria de tarefa para remover: ");
        lista.removerTarefas(scan.next());

        System.out.println(lista.obterNumeroTarefas());
        lista.imprimirLista();
    }
}