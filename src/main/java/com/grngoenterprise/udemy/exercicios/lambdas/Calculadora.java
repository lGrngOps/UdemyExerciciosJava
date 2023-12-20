package com.grngoenterprise.udemy.exercicios.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Calculadora {

    public static void main(String[] args) {

        Calculo somar = (x, y) -> x + y;
        System.out.println(somar.calcular(3,2));

        Calculo multi = (x, y) -> { return x * y; };
        System.out.println(multi.calcular(5,5));

        BinaryOperator<Double> div = (a , b) -> { return a / b; };
        System.out.println(div.apply(10.0,2.0));

        List<String> aprovados = Arrays.asList("Ju","Fe","Lu","Ka");

        for (String nome: aprovados){ //Foreach
            System.out.println(nome);
        }
        aprovados.forEach(nome -> System.out.println(nome + " Fuck Yeah")); //Lambda
        aprovados.forEach(System.out::println); // Method Reference
    }
}
