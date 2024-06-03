package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Esse método remove todas as tarefas com nome repetido também
    public void removerTarefas(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTarefas () {
        return tarefaList.size();
    }

    public void imprimirLista (){
        for(Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }
}
