package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana",7.1);
        Aluno aluno1 = new Aluno("Paloma",6.1);
        Aluno aluno2 = new Aluno("Kim",8.1);
        Aluno aluno3 = new Aluno("Malu",10);

        List<Aluno> alunos = Arrays.asList(aluno, aluno1, aluno2, aluno3);

        Comparator<Aluno> melhorNota = (al1 , al2) -> {
            if(al1.nota > al2.nota) return 1;
            if(al1.nota < al2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (al1 , al2) -> {
            if(al1.nota > al2.nota) return -1;
            if(al1.nota < al2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
