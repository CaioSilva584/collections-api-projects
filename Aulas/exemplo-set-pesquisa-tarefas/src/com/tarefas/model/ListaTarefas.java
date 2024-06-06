package com.tarefas.model;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t;
                break;
            }
        }

        tarefas.remove(tarefaRemover);
    }

    public void exibirTarefas (){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas (){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefas){
            if(t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes (){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefas){
            if(!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas () {
        tarefas.removeAll(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("CriarClasse1");
        lista.adicionarTarefa("CriarClasse2");
        lista.adicionarTarefa("Codar");
        lista.adicionarTarefa("Testar");
        lista.adicionarTarefa("Implementar");
        lista.adicionarTarefa("Domir");

        lista.exibirTarefas();
        System.out.println(lista.contarTarefas());

        lista.marcarTarefaConcluida("CriarClasse1");
        lista.marcarTarefaConcluida("CriarClasse2");
        lista.marcarTarefaConcluida("Codar");
        lista.marcarTarefaConcluida("Testar");
        lista.marcarTarefaConcluida("Domir");

        lista.exibirTarefas();

        lista.marcarTarefaPendente("Domir");
        lista.removerTarefa("Testar");

        lista.exibirTarefas();
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());

        lista.limparListaTarefas();

        lista.adicionarTarefa("MassagemNoMô");
        lista.exibirTarefas();

    }
}
