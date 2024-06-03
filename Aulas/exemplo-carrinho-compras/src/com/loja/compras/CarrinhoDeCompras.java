package com.loja.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        Item itemRemover = null;

        for (Item i : itens){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover = i;
            }
        }

        itens.remove(itemRemover);
    }

    public double calcularValorTotal(){
        double total = 0;

        for(Item i : itens){
            total += i.getPreco() * i.getQtde();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println("Itens: ");

        for (Item i : itens) {
            System.out.println("\nNome: " + i.getNome());
            System.out.println("Preco: R$ " + i.getPreco());
            System.out.println("Quantidade: " + i.getQtde());
        }
    }
}
