package com.convidados.model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidados (String nome, int codigo){
        convidados.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite (int codigo){
        Convidado convidadoRemover = null;

        for(Convidado c : convidados){
            if (c.getCodigoConvite() == codigo){
                convidadoRemover = c;
                break;
            }
        }

        convidados.remove(convidadoRemover);
    }

    public int contarConvidados (){
        return convidados.size();
    }

    public void exibirConvidados (){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidadosFesta = new ConjuntoConvidados();

        convidadosFesta.adicionarConvidados("João", 123);
        convidadosFesta.adicionarConvidados("Cabral", 153);
        convidadosFesta.adicionarConvidados("Joel", 223);
        convidadosFesta.adicionarConvidados("Cristóvan", 113);
        convidadosFesta.adicionarConvidados("ALmiro", 133);
        convidadosFesta.adicionarConvidados("Beth", 133);

        System.out.println("Existem " + convidadosFesta.contarConvidados() + " convidado(s) na festa");
        System.out.println("Lista de convidados: ");
        convidadosFesta.exibirConvidados();

        convidadosFesta.removerConvidadoPorCodigoConvite(143);

        System.out.println("Existem " + convidadosFesta.contarConvidados() + " convidado(s) na festa");
        System.out.println("Lista de convidados: ");
        convidadosFesta.exibirConvidados();

    }
}
