package com.livraria.model;

import com.livraria.util.ComparatorPreco;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String livroRemover = null;

        if (!livros.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livroRemover = entry.getKey();
                    break;
                }
            }
        }

        livros.remove(livroRemover);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosPorPreco, new ComparatorPreco());

        System.out.println(livrosPorPreco);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = 0;

        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getPreco() > maiorPreco) {
                    maiorPreco = l.getPreco();
                }
                if (l.getPreco() == maiorPreco) {
                    livroMaisCaro = l;
                }
            }
        }

        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getPreco() < menorPreco) {
                    menorPreco = l.getPreco();
                }
                if (l.getPreco() == menorPreco) {
                    livroMaisBarato = l;
                }
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.amazon.com.br/Este-Mundo-Tenebroso-Frank-Peretti/dp/8573670304",
                "Este Mundo Tenebroso Volume 1", "Frank Peretti", 79.90);
        livraria.adicionarLivro("https://www.amazon.com.br/assassino-profeta-Guillaume-Pr%C3%A9vost/dp/8582860919",
                "O Assassino e o Profeta", "Guillaume Prévost", 37.90);
        livraria.adicionarLivro("https://www.amazon.com.br/revolu%C3%A7%C3%A3o-dos-bichos-conto-fadas/dp/8535909559",
                "A revolução dos bichos", "George Orwell", 14.09);
        livraria.adicionarLivro("https://www.amazon.com.br/Arte-Guerra-Sun-Tzu/dp/8542805097",
                "A Arte da Guerra", "Sun Tzu", 12.40);
        livraria.adicionarLivro("https://www.amazon.com.br/Senhor-dos-An%C3%A9is-Sociedade-Anel/dp/8595084750",
                "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 52.43);

        livraria.exibirLivrosOrdenadosPorPreco();
        System.out.println(livraria.pesquisarLivrosPorAutor("Guillaume Prévost"));
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.exibirLivroMaisBarato());

        livraria.removerLivro("A Arte da Guerra");

        livraria.exibirLivrosOrdenadosPorPreco();
        System.out.println(livraria.pesquisarLivrosPorAutor("J.R.R. Tolkien"));
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.exibirLivroMaisBarato());
    }
}
