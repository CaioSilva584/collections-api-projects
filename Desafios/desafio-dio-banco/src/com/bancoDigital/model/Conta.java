package com.bancoDigital.model;

public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 10001;

    private Agencia agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    protected Conta(Agencia agencia, Cliente titular) {
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double sacar(double valor) {
        // Verifica se o valor a ser sacado não ultrapassa o limite do cheque especial (R$ 500.00)
        if ((this.saldo - valor) < -500.0) {
            System.out.println("Operação ultrapassa o limite de R$ 500.00 do cheque especial");
            return 0;
        } else {
            this.saldo -= valor;
            return valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // Verifica se o valor a ser sacado não ultrapassa o limite do cheque especial (R$ 500.00)
        if ((this.saldo - valor) < -500.0) {
            System.out.println("Operação ultrapassa o limite de R$ 500.00 do cheque especial");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }


    protected void imprimirInfosComuns() {
        System.out.printf("Agencia: %d%n", this.getAgencia().getNumero());
        System.out.printf("Numero: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", tipo=" + (this.getClass()
                .toString()
                .contains("ContaCorrente") ? "Conta Corrente" : "Conta Poupança") + "}\n";  // Verifica o tipo de conta para o print
    }
}
