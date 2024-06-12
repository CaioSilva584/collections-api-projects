package com.palavras.model;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras() {
        return palavras;
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        String palavra = " ";
        Integer frequencia = 0;

        if (!palavras.isEmpty()) {
            for (Map.Entry<String, Integer> p : palavras.entrySet()) {
                if (p.getValue() > frequencia) {
                    palavra = p.getKey();
                    frequencia = p.getValue();
                }
            }
        }

        palavraMaisFrequente.put(palavra, frequencia);

        return palavraMaisFrequente;

    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Pedro", 4);
        contagem.adicionarPalavra("Subiu", 7);
        contagem.adicionarPalavra("Lagoa", 1);
        contagem.adicionarPalavra("Jiboia", 10);

        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontrarPalavraMaisFrequente());

        contagem.removerPalavra("Jiboia");

        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
