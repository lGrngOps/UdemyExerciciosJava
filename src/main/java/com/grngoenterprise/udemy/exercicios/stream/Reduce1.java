package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce1 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana",7.1);
        Aluno aluno1 = new Aluno("Paloma",6.1);
        Aluno aluno2 = new Aluno("Kim",8.1);
        Aluno aluno3 = new Aluno("Malu",10);

        List<Aluno> alunos = Arrays.asList(aluno, aluno1, aluno2, aluno3);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno,Double> nota = a -> a.nota;
        BinaryOperator<Double> soma = (a,b) -> a + b;

        alunos.stream()
                .filter(aprovado)
                .map(nota)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
