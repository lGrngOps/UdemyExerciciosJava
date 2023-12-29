package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana",7.1);
        Aluno aluno1 = new Aluno("Paloma",6.1);
        Aluno aluno2 = new Aluno("Kim",8.1);
        Aluno aluno3 = new Aluno("Malu",10);

        List<Aluno> alunos = Arrays.asList(aluno, aluno1, aluno2, aluno3);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
