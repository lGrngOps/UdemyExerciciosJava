package com.grngoenterprise.udemy.exercicios.excecao.personalizadaExc;

public class NumeroIntervaloException extends Exception{

    private String nomeAtributo;

    public NumeroIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' esta fora do intervalo",nomeAtributo);
    }
}
