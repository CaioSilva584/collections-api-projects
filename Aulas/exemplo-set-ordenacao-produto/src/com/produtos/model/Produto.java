package com.produtos.model;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private double preco;
    private int qtde;

    public Produto(long codigo, String nome, double preco, int qtde) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome='" + nome + '\'' + ", preco=" + preco + ", qtde=" + qtde + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}
