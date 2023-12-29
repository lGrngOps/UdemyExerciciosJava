package com.grngoenterprise.udemy.exercicios.excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno al1 = null;

        try {
            imprimirNome(al1);
        } catch (Exception e) {
            System.out.println("Ocorreu erro na impressão do nome do usuario");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage() );
        }
        System.out.println(" Finish }:)");
    }
    public static void imprimirNome(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
