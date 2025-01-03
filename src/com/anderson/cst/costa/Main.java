package com.anderson.cst.costa;

import com.anderson.cst.costa.utils.OpcMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opc="";

            while (!opc.equalsIgnoreCase("7")){
                String moedaConv;
                String moedaRef;
                double vlrConver;
                OpcMenu opcMenu = new OpcMenu();

                System.out.println("\n*********************************************" +
                        "\n\nEscolha uma opção do menu para conversão: " +
                        "\n1) Dólar => Peso Argentino \n2) Peso Argetino => Dólar\n3) Dólar => Real Brasileiro" +
                        "\n4) Real Brasileiro => Dólar\n5) Dólar => Peso Colombiano\n6) Peso Colombiano => Dólar\n7) sair" +
                        "\nEscolha uma opçõa válida");
                opc = ler.nextLine();

                switch (opc) {
                        case "1":
                        moedaRef = "USD";
                        moedaConv = "ARS";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcUm(vlrConver, moedaConv, moedaRef);
                    break;
                    case "2":
                        moedaRef = "ARS";
                        moedaConv = "USD";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcDois(vlrConver, moedaConv, moedaRef);
                    break;
                    case "3":
                        moedaRef = "USD";
                        moedaConv = "BRL";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcTres(vlrConver, moedaConv, moedaRef);
                        break;
                    case "4":
                        moedaRef = "BRL";
                        moedaConv = "USD";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcQuatro(vlrConver, moedaConv, moedaRef);
                        break;
                    case "5":
                        moedaRef = "USD";
                        moedaConv = "COP";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcCinco(vlrConver, moedaConv, moedaRef);
                        break;
                    case "6":
                        moedaRef = "COP";
                        moedaConv = "USD";
                        System.out.println("\nDigite o valor para conversão:");
                        vlrConver = Double.parseDouble(ler.nextLine());
                        opcMenu.opcSeis(vlrConver, moedaConv, moedaRef);
                        break;
                    case "7": System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválido");
                        break;
                    }
            }


    }

}
