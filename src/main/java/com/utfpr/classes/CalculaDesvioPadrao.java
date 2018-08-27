package com.utfpr.classes;

import com.utfpr.classes.CalculaMedia;

public class CalculaDesvioPadrao {

    CalculaMedia media = new CalculaMedia();
    int i;

    public double calculaDesvio(double[] vetor) {
        double somatorio = 0;
        double mediaAri = media.calculaMedia(vetor);

        for (i = 0; i < vetor.length; i++) {
            double res = vetor[i] - mediaAri;
            somatorio = somatorio + res * res;
        }

        return Math.sqrt(((double) 1 / (vetor.length - 1)) * somatorio);
    }
}
