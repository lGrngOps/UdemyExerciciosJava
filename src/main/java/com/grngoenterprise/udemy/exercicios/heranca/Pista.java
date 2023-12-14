package com.grngoenterprise.udemy.exercicios.heranca;

public class Pista {

    public static void main(String[] args) {

        Uno bryan = new Uno();
        bryan.velocAtual = 0;

        Gol toreto = new Gol();
        toreto.velocAtual = 0;

        bryan.acelerar();
        toreto.acelerar();

        System.out.println("O'Conell = " + bryan.velocAtual);
        System.out.println("Vin Disel = " + toreto.velocAtual);

        bryan.acelerar();
        bryan.acelerar();
        bryan.acelerar();
        toreto.acelerar();
        toreto.acelerar();

        System.out.println("O'Conell = " + bryan.velocAtual);
        System.out.println("Vin Disel = " + toreto.velocAtual);

        bryan.frear();
        toreto.frear();

        System.out.println("O'Conell = " + bryan.velocAtual);
        System.out.println("Vin Disel = " + toreto.velocAtual);

        bryan.frear();
        toreto.frear();

        System.out.println("O'Conell = " + bryan.velocAtual);
        System.out.println("Vin Disel = " + toreto.velocAtual);

    }
}
