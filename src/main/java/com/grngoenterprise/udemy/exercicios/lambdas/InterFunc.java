package com.grngoenterprise.udemy.exercicios.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class InterFunc {

    public static void main(String[] args) {

        //PREDICATE
        Predicate<Produto> isExpensive =
                prod -> (prod.price * (1 - prod.discount)) >= 7000.00;

        Produto produto = new Produto("Note",3900.00,0.10);
        System.out.println(isExpensive.test(produto));

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isThreeDigits = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(isThreeDigits).test(12));
        System.out.println(isThreeDigits.or(isPar).test(123));

        // CONSUMER
        Consumer<Produto> printName = pro -> System.out.println(pro.name);
        Produto product = new Produto("Cellphone",4000.00,0.20);
        printName.accept(product);

        //FUNCTION
        Function<Integer,String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String,String> theResult = valor -> "O resultado é :" + valor;

        String finalResult = parOuImpar.andThen(theResult).apply(10);
        System.out.println(finalResult);

        //SUPPLIER
        Supplier<List<String>> aList = () -> Arrays.asList("Ju","Fe","Lu","Ka");
        System.out.println(aList.get());

        //Unary Operator
        UnaryOperator<Integer> plusTwo = n -> n + 2;
        UnaryOperator<Integer> multiplyTwo = n -> n * 2;
        UnaryOperator<Integer> quadrateTwo = n -> n * n;

        System.out.println(plusTwo.andThen(multiplyTwo).andThen(quadrateTwo).apply(0));
        int result = quadrateTwo.compose(multiplyTwo).compose(plusTwo).apply(0);
        System.out.println(result);

        // Binary Operator
        BinaryOperator<Double> media = (Double x , Double y) -> ((x + y) / 2);
        System.out.println(media.apply(9.8,5.7));

        Function<Double,String> concept = f -> f >= 7 ? "Approve" : "Disapprove";
        System.out.println(media.andThen(concept).apply(9.8,5.7));

        BiFunction<Double, Double, String> results = (Double n1, Double n2) -> {
            double finalNote = ((n1 + n2) / 2);
            return finalNote >= 7 ? "Approve" : "Disapprove";
        };
        System.out.println(results.apply(9.8,3.7));
    }
}
