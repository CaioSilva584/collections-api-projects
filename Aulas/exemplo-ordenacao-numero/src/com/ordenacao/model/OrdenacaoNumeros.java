package com.ordenacao.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero (int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(numeros);

        Collections.sort(listaAscendente);

        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(numeros);

        Collections.sort(listaDescendente);
        Collections.reverse(listaDescendente);

        return listaDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(230);
        listaNumeros.adicionarNumero(21);
        listaNumeros.adicionarNumero(29);
        listaNumeros.adicionarNumero(28);

        System.out.println(listaNumeros);
        System.out.println(listaNumeros.ordenarAscendente());
        System.out.println(listaNumeros.ordenarDescendente());
    }
}
