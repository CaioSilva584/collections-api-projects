package main.java.app;

import com.loja.compras.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Notebook", 2500.00, 1);
        carrinho.adicionarItem("Chocolate", 3.00, 10);
        carrinho.adicionarItem("Jogos", 50.00, 5);
        carrinho.adicionarItem("Livro", 20.00, 8);
        carrinho.adicionarItem("Sapato", 12.00, 1);

        carrinho.exibirItens();
        System.out.println("Total a ser pago: R$ " + carrinho.calcularValorTotal());

        carrinho.removerItem("sapato");

        carrinho.exibirItens();
        System.out.println("Total a ser pago: R$ " + carrinho.calcularValorTotal());

    }
}
