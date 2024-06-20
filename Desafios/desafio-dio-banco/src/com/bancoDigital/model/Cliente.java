package com.bancoDigital.model;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public Cliente(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome;
    }
}
