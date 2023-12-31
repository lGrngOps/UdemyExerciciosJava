package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString() {
        return nome + " tem a nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}


