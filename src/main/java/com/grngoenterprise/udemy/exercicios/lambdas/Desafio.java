package com.grngoenterprise.udemy.exercicios.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Function<Produto, Double> finalPrice =
                calculo -> calculo.price * (1 - calculo.discount);

        UnaryOperator<Double> taxMunicipal =
                price -> price >= 2500 ? price * 1.085 : price;

        UnaryOperator<Double> shipping =
                price -> price >= 3000 ? price + 100 : price + 50;

        Function<Double, String> round =
                price -> String.format("%.2f", price);

        Function<String, String> format =
                price -> ("R$" + price).replace(".",",");

        Produto product = new Produto("iPad", 3235.89, 0.13);

        String price = finalPrice
                .andThen(taxMunicipal)
                .andThen(shipping)
                .andThen(round)
                .andThen(format)
                .apply(product);

        System.out.println(" O preço final é :" + price);
    }
}
