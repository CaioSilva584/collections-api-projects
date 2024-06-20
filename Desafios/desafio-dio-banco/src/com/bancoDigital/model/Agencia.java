package com.bancoDigital.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agencia {
    private int numero;
    private String telefone;
    private String endereco;
    private List<Conta> contas;
    private Banco banco;

    public Agencia(int numero, String telefone, String endereco) {
        this.numero = numero;
        this.telefone = telefone;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Conta abrirConta(Cliente titular, String tipo) {
        Conta cc = null;
        // Verifica o tipo informado e define qual tipo de conta será aberta (Conrrente ou Poupança)
        if (tipo.equalsIgnoreCase("Poupança")) {
            cc = new ContaPoupanca(this, titular);
            contas.add(cc);
            return cc;
        } else if (tipo.equalsIgnoreCase("Corrente")) {
            cc = new ContaCorrente(this, titular);
            contas.add(cc);
            return cc;
        } else {
            return null;
        }

    }

    public Conta pesquisarContaPorNumero(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst().orElseThrow(() -> new RuntimeException("Conta informada não encontrada"));
    }

    @Override
    public String toString() {
        return "Agencia=" + numero;
    }

}
