package com.grngoenterprise.udemy.exercicios.excecao;

public class Check {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    // Exceção NÃO Checada / Verificada (Runtime)
    static void geraErro1(){
        throw new RuntimeException("Se fuuuu }8D #01");
    }

    //Exceção Checada / Verificada (Exception)
    static void geraErro2() throws Exception{
        throw new Exception("Se fuuuu }8D #02");
    }
}

