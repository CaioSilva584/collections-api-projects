package com.bancoDigital.model;

public class ContaCorrente extends Conta {

    protected ContaCorrente(Agencia agencia, Cliente titular) {
        super(agencia, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        imprimirInfosComuns();
    }

}
