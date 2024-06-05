package com.comparable.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade (){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura (){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "pessoas=" + pessoas +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoPessoas lista = new OrdenacaoPessoas();
        List<Pessoa> listaOrdenadaIdade;
        List<Pessoa> listaOrdenadaAltura;

        lista.adicionarPessoa("Diego", 12, 123.0);
        lista.adicionarPessoa("Ariego", 33, 170.0);
        lista.adicionarPessoa("Amanda<3S2", 25, 160.0);
        lista.adicionarPessoa("Caio", 22, 180.0);
        lista.adicionarPessoa("Milton", 40, 178.0);
        lista.adicionarPessoa("Jaldir", 150, 800.0);
        lista.adicionarPessoa("Jurema", 120, 610.0);

        System.out.println(lista);

        listaOrdenadaAltura = lista.ordenarPorAltura();
        System.out.println(listaOrdenadaAltura);


        listaOrdenadaIdade = lista.ordenarPorIdade();
        System.out.println(listaOrdenadaIdade);
    }
}
