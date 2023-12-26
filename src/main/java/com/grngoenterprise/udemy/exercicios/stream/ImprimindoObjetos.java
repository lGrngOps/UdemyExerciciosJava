package com.grngoenterprise.udemy.exercicios.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ju","Lu","Ana","Gui");

        // Foreach
        for (String nome: aprovados){
            System.out.println(nome);
        }

        // Iterator
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Stream
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
