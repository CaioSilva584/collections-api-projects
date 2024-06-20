package com.bancoDigital.model;

public interface IConta {
    double sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
