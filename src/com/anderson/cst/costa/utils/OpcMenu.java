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
        System.out.println(FormMoedas.usdFomatFunc(vlrConver) + " Dólares convertidos para Reais são "
                + FormMoedas.brlFomatFunc(respConver));
    }

    public void opcQuatro(double vlrConver, String moedaConv, String moedaRef) {
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Real equivale à "
                + FormMoedas.usdFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) + " Dólares");
        System.out.println(FormMoedas.usdFomatFunc(vlrConver) + " Dólares convertidos para Reais são "
                + FormMoedas.brlFomatFunc(respConver));
    }

    public void opcCinco(double vlrConver, String moedaConv, String moedaRef) {
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Peso Colombiano equivale à "
                + FormMoedas.usdFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) + " Dólar");
        System.out.println(FormMoedas.usdFomatFunc(vlrConver) + " Dólares convertidos para Pesos Colombianos são "
                + FormMoedas.copFomatFunc(respConver));
    }

    public void opcSeis(double vlrConver, String moedaConv, String moedaRef) {
        double respConver;
        double moedaVlrAtual;
        moedaVlrAtual = Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv);
        respConver = vlrConver * moedaVlrAtual;
        System.out.println("1 Dólar equivale à "
                + FormMoedas.copFomatFunc(Consumo.consomeAPI(moedaRef).obterCotacaoId(moedaConv)) + " Peso Colombiano");
        System.out.println(FormMoedas.copFomatFunc(vlrConver) + " Pesos Colombianos convertidos para Dólares são "
                + FormMoedas.usdFomatFunc(respConver));
    }
}