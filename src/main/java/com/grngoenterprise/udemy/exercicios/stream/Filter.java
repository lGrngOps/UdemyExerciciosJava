package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana",7.5);
        Aluno aluno2 = new Aluno("José",8.0);
        Aluno aluno3 = new Aluno("Jussara",9.5);
        Aluno aluno4 = new Aluno("Pelé",6.5);

        List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> saudacao = aluno -> "Congratulations " + aluno.nome + " !!! Não fez mais do que a obrigação !!!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacao)
                .forEach(System.out::println);

        System.out.println();

        alunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> "Congrats " + aluno.nome)
                .forEach(System.out::println);
    }
}
