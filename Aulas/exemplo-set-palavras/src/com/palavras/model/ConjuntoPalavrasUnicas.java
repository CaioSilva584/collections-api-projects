package com.palavras.model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(new String(palavra));
    }

    public void removerPalavra(String palavra){
        String palavraRemover = "";

        for(String p : palavras){
            if (p.equalsIgnoreCase(palavra)){
                palavraRemover = p;
                break;
            }
        }

        palavras.remove(palavraRemover);
    }

    public void veriicarPalavra (String palavra){
        String palavraVerificada = "";

        for(String p : palavras){
            if (p.equalsIgnoreCase(palavra)){
                palavraVerificada = p;
                break;
            }
        }

        if (!palavraVerificada.isBlank()){
            System.out.println("A palavra \"" + palavraVerificada + "\" está contida no conjunto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não foi encontrada no conjunto.");
        }

    }

    public void exibirPalavrasUnicas () {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Preto");
        conjunto.adicionarPalavra("Jaguar");
        conjunto.adicionarPalavra("Lesgato");
        conjunto.adicionarPalavra("Acarajé");
        conjunto.adicionarPalavra("Groenlandia");
        conjunto.adicionarPalavra("Preto");
        conjunto.adicionarPalavra("Preto");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Jaguar");

        conjunto.veriicarPalavra("Jaguar");
        conjunto.veriicarPalavra("Lesgato");
        conjunto.exibirPalavrasUnicas();

    }
}
