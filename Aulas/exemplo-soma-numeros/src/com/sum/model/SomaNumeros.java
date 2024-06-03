package com.sum.model;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero (int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        if(!numeros.isEmpty()){
            for (int n : numeros){
                soma += n;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;

        if(!numeros.isEmpty()){
            for (int n : numeros){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;

        if(!numeros.isEmpty()){
            for (int n : numeros){
                if(n < menorNumero){
                    menorNumero = n;
                }
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){

        if(!numeros.isEmpty()){
            for (int n : numeros){
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(10);
        soma.adicionarNumero(2);
        soma.adicionarNumero(-5);
        soma.adicionarNumero(30);
        soma.adicionarNumero(78);
        soma.adicionarNumero(-27);

        System.out.println(soma.calcularSoma());
        soma.exibirNumeros();
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
    }
}
