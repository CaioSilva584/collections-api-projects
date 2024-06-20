package com.bancoDigital.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias;
    private String site;

    public Banco(String nome, String site) {
        this.nome = nome;
        this.site = site;
        agencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public String getSite() {
        return site;
    }

    public void associarAgencia(Agencia agencia) {
        agencia.setBanco(this);
        agencias.add(agencia);
    }

    public Conta abrirConta(Agencia agencia, Cliente titular, String tipo) {
        // Pesquisa a agência e, se encontrada, abre uma nova conta
        return agencias.stream()
                .filter(a -> a.equals(agencia))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Agencia informada é invalida"))
                .abrirConta(titular, tipo);
    }

    public Agencia pesquisarAgenciaPorNumero (int numero){
        // Pesquisa uma agência pelo número e retorna o resultado
        return agencias.stream()
                .filter(a -> a.getNumero() == numero)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Agencia informada não encontrada"));
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }

}