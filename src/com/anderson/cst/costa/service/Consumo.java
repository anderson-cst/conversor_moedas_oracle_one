package com.anderson.cst.costa.service;

import com.anderson.cst.costa.modelos.Cotacao;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consumo {
    public static final HttpClient client = HttpClient.newHttpClient();

    public static Cotacao consomeAPI(String moedaConv) {
        Cotacao cotac = new Cotacao();
        try {
            String endereco = "https://v6.exchangerate-api.com/v6/" + System.getenv("EXCHANGE_API_KEY")
                    + "/latest/" + moedaConv;

            HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
            String json = resp.body();

            JsonElement jsonEl = JsonParser.parseString(json);
            JsonObject jsonObj = jsonEl.getAsJsonObject();
            Gson gson = new Gson();
            cotac = gson.fromJson(jsonObj, Cotacao.class);
        } catch (
                IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return cotac;
    }

}
