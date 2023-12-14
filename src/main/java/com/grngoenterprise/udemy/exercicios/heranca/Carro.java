package com.grngoenterprise.udemy.exercicios.heranca;

public class Carro {

    int velocAtual;

    void acelerar (){
        velocAtual += 5;
    }

    void frear (){
        if (velocAtual >= 5){
            velocAtual -= 5;
        } else {
            velocAtual = 0;
        }
    }
}
