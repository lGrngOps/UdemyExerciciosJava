package com.grngoenterprise.udemy.exercicios.arraycollec;

import java.util.*;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qtdAlunos = leitor.nextInt();
        int qtdNotas = leitor.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];
        double total = 0;

        for (int x=0; x < notasTurma.length; x++){
            for (int y=0; y < notasTurma[x].length; y++){
                notasTurma[x][y] = leitor.nextDouble();
                total += notasTurma[x][y];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);

        for (double[] notasAluno: notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }

        System.out.println(media);
    }
}
