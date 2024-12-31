package com.anderson.cst.costa.service;

import com.anderson.cst.costa.modelos.Cotacao;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consumo {

    public static Cotacao consomeAPI(String valConv) {
        Cotacao cotac = new Cotacao();
        try {
            String endereco = "https://v6.exchangerate-api.com/v6/"+ System.getenv("EXCHANGE_API_KEY") +"/latest/"+valConv;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
            String json = resp.body();
            Gson gson = new Gson();
            cotac = gson.fromJson(json, Cotacao.class);

        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cotac;
    }

}
