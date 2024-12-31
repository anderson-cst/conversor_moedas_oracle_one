package com.anderson.cst.costa;

import com.anderson.cst.costa.utils.OpcMenu;

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
                String moedaConv;
                String moedaRef;
                double vlrConver;
                OpcMenu opcMenu = new OpcMenu();
                switch (opc) {
                        case "1":
                        moedaConv = "ARS";
                        moedaRef = "USD";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcUm(vlrConver, moedaConv, moedaRef);
                    break;
                    case "2":
                        moedaConv = "USD";
                        moedaRef = "ARS";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcDois(vlrConver, moedaConv, moedaRef);
                    break;
                    case "3":
                        moedaConv = "BRL";
                        moedaRef = "USD";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcTres(vlrConver, moedaConv, moedaRef);
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
