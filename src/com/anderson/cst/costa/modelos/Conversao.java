package com.anderson.cst.costa.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;


public class Conversao {
    @SerializedName("conversion_rates")
    private Map<String, Double> taxaConv;

    public Conversao() {
        this.taxaConv = taxaConv;
    }

    public Double obterCotacaoId(String busca) {
        return this.taxaConv.get(busca);
    }

    public Map<String, Double> getTaxaConv() {
        return taxaConv;
    }

    public void setTaxaConv(Map<String, Double> taxaConv) {
        this.taxaConv = taxaConv;
    }

    public void imprimirTodos() {
        for (Map.Entry<String, Double> entry : taxaConv.entrySet()) {
            System.out.println("Código da Moeda: " + entry.getKey() + ", Valor da cotação atual: " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "taxaConv = " + taxaConv;
    }
}