package com.contatos.model;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesqusiarPorNome (String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatos){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato c : contatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Clodoaldo", 1515);
        agenda.adicionarContato("Clodoaldo Pizza", 1516);
        agenda.adicionarContato("Clodoaldo Dev", 1617);
        agenda.adicionarContato("Clodoaldo Peterson", 1715);
        agenda.adicionarContato("Armandinho", 1478);
        agenda.adicionarContato("Fredericos", 1987);

        agenda.exibirContatos();

        System.out.println(agenda.pesqusiarPorNome("Clodo"));

        agenda.atualizarNumeroContato("Armandinho", 1512);

        agenda.exibirContatos();
    }
}
