package com.grngoenterprise.udemy.exercicios.excecao.personalizadaRun;

public class NumeroIntervaloException extends RuntimeException{

    private String nomeAtributo;

    public NumeroIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' esta fora do intervalo",nomeAtributo);
    }
}
