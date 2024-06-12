package com.livraria.model;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return " {Livro: " +
                "titulo - " + titulo +
                ", autor - " + autor +
                ", preco - R$ " + preco +
                ".}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Double.compare(getPreco(), livro.getPreco()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPreco());
    }
}
