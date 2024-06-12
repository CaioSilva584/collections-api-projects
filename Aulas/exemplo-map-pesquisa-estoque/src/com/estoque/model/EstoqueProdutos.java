package com.estoque.model;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public void adicionarProdutos(Integer codigo, String nome, double preco, int quantidade) {
        produtos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public Map<Integer, Produto> exibirProdutos() {
        return produtos;
    }

    public double calcularValorTotalEstoque() {
        double totalEstoque = 0;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                totalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoMaisAlto = Double.MIN_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (p.getPreco() > precoMaisAlto) {
                    produtoMaisCaro = p;
                    precoMaisAlto = produtoMaisCaro.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (p.getPreco() < precoMaisBaixo) {
                    produtoMaisBarato = p;
                    precoMaisBaixo = produtoMaisBarato.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMAiorQuantidade = null;
        int maiorQuantidade = Integer.MIN_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (p.getQuantidade() > maiorQuantidade) {
                    produtoMAiorQuantidade = p;
                    maiorQuantidade = produtoMAiorQuantidade.getQuantidade();
                }
            }
        }
        return produtoMAiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutos(1212, "Bola", 12d, 10);
        estoque.adicionarProdutos(1213, "Macarrao", 9d, 100);
        estoque.adicionarProdutos(1214, "Marmita", 20d, 20);
        estoque.adicionarProdutos(1215, "Sabão", 20d, 50);
        estoque.adicionarProdutos(1216, "Leite", 6d, 200);

        System.out.println(estoque.exibirProdutos());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.calcularValorTotalEstoque());
    }
}
