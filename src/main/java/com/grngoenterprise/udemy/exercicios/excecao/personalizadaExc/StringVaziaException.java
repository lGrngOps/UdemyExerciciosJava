package com.grngoenterprise.udemy.exercicios.excecao.personalizadaExc;

public class StringVaziaException extends Exception{

    private String nomeAtributo;

    public StringVaziaException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' esta vazio",nomeAtributo);
    }
}
