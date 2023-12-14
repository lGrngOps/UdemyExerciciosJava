package com.grngoenterprise.udemy.exercicios.arraycollec;

import java.util.List;
import java.util.Scanner;

public class ExercicioArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem Vindo");
        System.out.println("Gentileza informe a quantidade de notas a serem inseridas : ");
        int i = leitor.nextInt();

        double[] notasAluno = new double[i];
        double total = 0;

        for (int x = 0; x < notasAluno.length; x++){
            System.out.println("Gentileza informar " + (x + 1) + "ª nota :");
            notasAluno[x] = leitor.nextDouble();
        }

        for (double notas : notasAluno){
            total += notas;
            System.out.println("Notas :" + List.of(notas));
        }

        System.out.println("Media final : " + total / i);
        System.out.println("Total : " + total);
    }
}
