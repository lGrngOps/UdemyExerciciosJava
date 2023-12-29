package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana",7.1);
        Aluno aluno1 = new Aluno("Paloma",6.1);
        Aluno aluno2 = new Aluno("Kim",8.1);
        Aluno aluno3 = new Aluno("Malu",10);
        Aluno aluno4 = new Aluno("Ana",7.1);
        Aluno aluno5 = new Aluno("Pedro",9.1);
        Aluno aluno6 = new Aluno("Gui",8.1);
        Aluno aluno7 = new Aluno("Maria",10);


        List<Aluno> alunos = Arrays.asList(aluno, aluno1, aluno2, aluno3,aluno4,aluno5,aluno6,aluno7);

        // DISTINCT
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println();

        //SKIP ~ LIMIT
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println();

        //TAKE WHILE
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
