package com.alunos.model;

import com.alunos.util.ComparatorNota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;

        for (Aluno a : alunos){
            if (a.getMatricula() == matricula){
                alunoRemover = a;
            }
        }

        alunos.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());

        for (Aluno a : alunos){
            alunosPorNota.add(a);
        }

        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Zelão", 1212L, 10.0);
        gerenciador.adicionarAluno("Ditão", 1213L, 10.0);
        gerenciador.adicionarAluno("Tonhão", 1214L, 10.0);
        gerenciador.adicionarAluno("Carlão", 1215L, 10.0);
        gerenciador.adicionarAluno("Betão", 1216L, 10.0);
        gerenciador.adicionarAluno("Tião", 1217L, 10.0);
        gerenciador.adicionarAluno("Caião", 1218L, 10.0);
        gerenciador.adicionarAluno("Betinho", 1219L, 10.0);
        gerenciador.adicionarAluno("Betinho", 12112L, 10.0);
        gerenciador.adicionarAluno("Betinho", 12113L, 10.0);
        gerenciador.adicionarAluno("Betinho", 12114L, 10.0);
        gerenciador.adicionarAluno("Betinho", 12115L, 10.0);

        System.out.println(gerenciador.exibirAlunos());

        gerenciador.removerAluno(1219L);

        System.out.println(gerenciador.exibirAlunosPorNome());
        System.out.println(gerenciador.exibirAlunosPorNota());


    }
}
