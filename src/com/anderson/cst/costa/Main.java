package com.anderson.cst.costa;

import com.anderson.cst.costa.modelos.Cotacao;
import com.anderson.cst.costa.service.Consumo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opc="";

            while (!opc.equalsIgnoreCase("7")){
                System.out.println("\n*********************************************" +
                        "\n\nEscolha uma opção do menu para conversão: " +
                        "\n1) Dólar => Peso Argentino \n2) Peso Argetino => Dólar\n3) Dólar => Real Brasileiro" +
                        "\n4) Real Brasileiro => Dólar\n5) Dólar => Peso Colombiano\n6) Peso Colombiano => Dólar\n7) sair" +
                        "\nEscolha uma opçõa válida");
                opc = ler.nextLine();
                Double resConver;
                String moedaConv = "";
                Double vlrConver;
                Cotacao retCotacAPI = Consumo.consomeAPI("USD");
                    switch (opc) {
                    case "1":
                        moedaConv = "ARS";
                        System.out.println(retCotacAPI);
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.valueOf(ler.nextLine());
                        resConver = vlrConver*retCotacAPI.obterCotacaoId(moedaConv);
                        System.out.println("1 Dólar equivale à AR$ "+retCotacAPI.obterCotacaoId(moedaConv)+" Pesos Argentinos");
                        System.out.println(vlrConver+" Dólares convertidos para Pesos Argentinos são AR$ "+resConver);
                    break;
                    case "2":
                        Double vlr=0.00097040;
                        float vlr1= (float) 0.00097040;
                        System.out.println(vlr*100);
                        System.out.println(vlr1);
                        moedaConv = "USD";
                        String vlrRef = "ARS";
                        NumberFormat formARS = NumberFormat.getCurrencyInstance(new Locale("es", "ARS"));
                        NumberFormat formUSD = NumberFormat.getCurrencyInstance(new Locale("en", "USD"));
                        DecimalFormatSymbols simbolosUSD = new DecimalFormatSymbols(new Locale("en", "USD"));
                        simbolosUSD.setCurrencySymbol("USD$");
                        simbolosUSD.setGroupingSeparator(',');
                        simbolosUSD.setDecimalSeparator('.');
                        // Definindo o padrão de formato com os símbolos configurados
                        DecimalFormat decimalFormat = new DecimalFormat("USD$ #.#######", simbolosUSD);

                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.valueOf(ler.nextLine());
                        resConver = vlrConver*Consumo.consomeAPI(vlrRef).obterCotacaoId(moedaConv);
                        System.out.println(Consumo.consomeAPI(vlrRef));
                        System.out.println("1 Peso Argentino equivale à "
                                +decimalFormat.format(Consumo.consomeAPI(vlrRef).obterCotacaoId(moedaConv)) +" Dólar");
                        System.out.println(vlrConver+" Pesos Argentinos convertidos para Dólares são "
                                +decimalFormat.format(resConver));
                    break;
                    case "3":
                        System.out.println("Terça-feira");
                        break;
                    case "4":
                        System.out.println("Quarta-feira");
                        break;
                    case "5":
                        System.out.println("Quinta-feira");
                        break;
                    case "6": System.out.println("Sexta-feira");
                        break;
                    case "7": System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Dia inválido");
                        break;
                    }
            }


    }

}
