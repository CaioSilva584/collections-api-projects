package com.agenda.model;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        contatos.put(nome, numero);
    }

    public void removerContato (String nome){
        if (!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    public Map<String, Integer> exibirContatos () {
        return contatos;
    }

    public Integer pesquisarPorNome (String nome) {
        Integer numeroPorNome = null;

        if(!contatos.isEmpty()){
            numeroPorNome = contatos.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Tonhão", 12345);
        agenda.adicionarContato("Carlão", 12346);
        agenda.adicionarContato("Ditão", 12347);
        agenda.adicionarContato("Zelão", 12348);
        agenda.adicionarContato("Timão", 12349);
        agenda.adicionarContato("Biba", 12350);

        System.out.println(agenda.exibirContatos());

        agenda.removerContato("Biba");

        System.out.println(agenda.exibirContatos());

        System.out.println(agenda.pesquisarPorNome("Tonhão"));
    }
}
