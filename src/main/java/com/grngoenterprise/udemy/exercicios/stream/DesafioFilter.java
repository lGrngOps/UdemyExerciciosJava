package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto produto = new Produto("Note",4900.00, 0.30,0);
        Produto produto1 = new Produto("Monitor",900.00, 0.10,0);
        Produto produto2 = new Produto("Smartwatch",500.00, 0.50,10);
        Produto produto3 = new Produto("Impressora",1500.00, 0.60,50);

        List<Produto> produtos = Arrays.asList(produto,produto1,produto2,produto3);

        Predicate<Produto> promo = prod -> prod.desconto >= 0.3;
        Predicate<Produto> ship = prod -> prod.valorFrete == 0;
        Predicate<Produto> priceRel = prod -> prod.preco >= 600;
        Function<Produto, String> callPromo = prod -> "Aproveite !!! " + prod.nome + " por R$" + prod.preco;

        produtos.stream()
                .filter(promo)
                .filter(ship)
                .filter(priceRel)
                .map(callPromo)
                .forEach(System.out::println);

        System.out.println();

        produtos.stream()
                .filter(prod -> prod.desconto >= 0.5)
                .map(prod -> "Somente Hoje !!! Aproveite este produto :" + prod.nome)
                .forEach(System.out::println);
    }
}
