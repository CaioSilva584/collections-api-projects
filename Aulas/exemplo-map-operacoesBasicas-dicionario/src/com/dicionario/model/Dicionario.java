package com.dicionario.model;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public Map<String, String> exibirPalavras() {
        return palavras;
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;

        if (!palavras.isEmpty()) {
            palavraPesquisada = palavras.get(palavra);
        }

        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Oi", "Saudacao");
        dicionario.adicionarPalavra("Tchau", "Despedida");
        dicionario.adicionarPalavra("Sim", "Concordar");
        dicionario.adicionarPalavra("Não", "Discordar");

        System.out.println(dicionario.exibirPalavras());
        System.out.println(dicionario.pesquisarPorPalavra("Sim"));
    }
}
