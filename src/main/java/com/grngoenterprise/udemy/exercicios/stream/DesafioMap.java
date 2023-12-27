package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        // 1 - Numero para string binaria ... 6 -> "110"
        // 2 - Inverter a string "110" -> "011"
        // 3 - Converter de volta pra inteiro -> "011" -> 3

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Integer, String> trans = i -> Integer.toBinaryString(i);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String,Integer> bintoInt = s -> Integer.parseInt(s,2);

        nums.stream()
                .map(trans)
                .map(inverter)
                .map(bintoInt)
                .forEach(System.out::println);

        /*
        int num = 6;

        String bin = Integer.toBinaryString(num);
        System.out.println(bin);

        String teste = bin;
        String inversao = new StringBuilder(teste).reverse().toString();
        System.out.println(inversao);

        int rever = Integer.parseInt(inversao);

         */
    }
}
