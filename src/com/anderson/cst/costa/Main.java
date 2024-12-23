package com.anderson.cst.costa;

import com.anderson.cst.costa.modelos.Conversao;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conversao cotac = new Conversao();
        String api_key = "d7916f9027b21922a20f5449";
        Scanner ler = new Scanner(System.in);
        String valConv = "USD";
        String menu="";

            while (!menu.equalsIgnoreCase("sair")){
                System.out.println("*********************************************" +
                        "\n\nEscolha uma opção do menu para conversão: " +
                        "\n1) Dólar => Peso Argentino \n2) Peso Argetino => Dólar\n3) Dólar => Real Brasileiro" +
                        "\n4) Real Brasileiro => Dólar\n5) Dólar => Peso Colombiano\n6) Peso Colombiano => Dólar\n7) sair" +
                        "\nEscolha uma opçõa válida");
                menu = ler.nextLine();

                try {
                    String endereco = "https://v6.exchangerate-api.com/v6/"+api_key+"/latest/"+valConv;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest req = HttpRequest.newBuilder()
                            .uri(URI.create(endereco))
                            .build();
                    HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
                    String json = resp.body();
                    Gson gson = new Gson();
                    cotac = gson.fromJson(json, Conversao.class);

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(menu.equalsIgnoreCase("7")){
                    break;
                }
                    switch (menu) {
                    case "1":
                        valConv = "USD";
                        Double vlrConversao;
                        Double vlrMoeda;
                        System.out.println("Digite o valor em dólares para conversão para pesos argentinos: ");
                        vlrConversao = Double.valueOf(ler.nextLine())*cotac.obterCotacaoId("ARS");
                        //vlrMoeda = cotac.obterCotacaoId("ARS");
                        System.out.println(cotac.obterCotacaoId("ARS"));
                        System.out.println(vlrConversao);
                        //System.out.println("Domingo");
                        break;
                    case "2":
                        System.out.println("Segunda-feira");
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
                    case "7": System.out.println("Sábado");
                        break;
                    default:
                        System.out.println("Dia inválido");
                        break;
                    }
            }


    }

}
