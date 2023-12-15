package com.grngoenterprise.udemy.exercicios.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99);

        Arroz ingrediente1 = new Arroz(5);
        Comida ingrediente2 = new Feijao(10);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());
    }
}
