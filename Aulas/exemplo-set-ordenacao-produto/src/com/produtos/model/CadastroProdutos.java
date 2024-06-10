package com.produtos.model;

import com.produtos.util.ComparatorPreco;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);

        //Para listas era utilizado o "Collections.sort(<lista>);"
        //Por se tratar de uma árvore, sempre estará ordenada de acordo com o comparable estabelecido

        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPreco());

        produtosPorPreco.addAll(produtos);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1212L, "Caneca", 20.00, 100);
        cadastro.adicionarProduto(1213L, "Alho", 10.00, 100);
        cadastro.adicionarProduto(1214L, "Multímetro", 200.00, 100);
        cadastro.adicionarProduto(1215L, "Sapato", 150.00, 100);
        cadastro.adicionarProduto(1216L, "Peixe", 5.00, 100);
        cadastro.adicionarProduto(1217L, "Armadura", 500.00, 100);
        cadastro.adicionarProduto(1218L, "Prato", 10.00, 100);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
