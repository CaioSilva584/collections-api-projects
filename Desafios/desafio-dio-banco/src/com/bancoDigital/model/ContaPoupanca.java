package com.bancoDigital.model;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    protected ContaPoupanca(Agencia agencia, Cliente titular) {
        super(agencia, titular);
        this.taxaRendimento = 0.1;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfosComuns();
    }


}
