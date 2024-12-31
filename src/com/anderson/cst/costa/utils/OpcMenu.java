package com.anderson.cst.costa.utils;

import com.anderson.cst.costa.service.Consumo;

public class OpcMenu {

    public void opcUm(double vlrConver, String moedaConv, String moedaRef){
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Dólar equivale à "
                + FormMoedas.arsFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) +" Pesos Argentinos");
        System.out.println(FormMoedas.usdFomatFunc(vlrConver) +" Dólares convertidos para Pesos Argentinos são "
                + FormMoedas.arsFomatFunc(respConver));

    }

    public void opcDois(double vlrConver, String moedaConv, String moedaRef) {
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Peso Argentino equivale à "
                + FormMoedas.usdFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) + " Dólares");
        System.out.println(FormMoedas.arsFomatFunc(vlrConver) + " Pesos Argentinos convertidos para Dólares são "
                + FormMoedas.usdFomatFunc(respConver));
    }

    public void opcTres(double vlrConver, String moedaConv, String moedaRef) {
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Dólar equivale à "
                + FormMoedas.brlFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) + " Real");
        System.out.println(FormMoedas.brlFomatFunc(vlrConver) + " Reais convertidos para Dólares são "
                + FormMoedas.usdFomatFunc(respConver));
    }
}