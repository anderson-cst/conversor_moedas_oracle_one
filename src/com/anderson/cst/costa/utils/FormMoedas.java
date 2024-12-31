package com.anderson.cst.costa.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormMoedas {

    public static String usdFomatFunc(double moeda) {
        DecimalFormatSymbols cifrUSD = new DecimalFormatSymbols(new Locale("en", "USD"));
        DecimalFormat usdFormat = new DecimalFormat("USD$ #,#######0.000000", cifrUSD);
        return usdFormat.format(moeda);
    }

    public static String arsFomatFunc(double moeda) {
        DecimalFormatSymbols cifrARS = new DecimalFormatSymbols(new Locale("es", "ARS"));
        DecimalFormat arsFormat = new DecimalFormat("ARS$ #,#######0.00", cifrARS);
        return arsFormat.format(moeda);
    }

    public static String brlFomatFunc(double moeda) {
        DecimalFormatSymbols cifrBRL = new DecimalFormatSymbols(new Locale("pt", "BRL"));
        DecimalFormat brlFormat = new DecimalFormat("R$ #,#######0.00", cifrBRL);
        return brlFormat.format(moeda);
    }

    public static String copFomatFunc(double moeda) {
        DecimalFormatSymbols cifrCOP = new DecimalFormatSymbols(new Locale("es", "COP"));
        DecimalFormat copFormat = new DecimalFormat("COP$ #,#######0.00", cifrCOP);
        return copFormat.format(moeda);
    }
}
