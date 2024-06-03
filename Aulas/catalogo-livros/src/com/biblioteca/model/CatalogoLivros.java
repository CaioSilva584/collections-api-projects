package com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        catalogo = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "Autor3", 2001);
        catalogoLivros.adicionarLivro("Livro2", "Autor3", 2003);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2004);
        catalogoLivros.adicionarLivro("Livro4", "Autor2", 1950);
        catalogoLivros.adicionarLivro("Livro5", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro6", "Autor1", 1945);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro5"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2023));
    }
}
