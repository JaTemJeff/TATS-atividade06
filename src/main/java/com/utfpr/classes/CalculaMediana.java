package com.utfpr.classes;

import java.util.Arrays;

public class CalculaMediana {

    int i;
    double res = 0;

    public double calculaMediana(double vetor[]) {
        Arrays.sort(vetor);
        if (vetor.length == 0) {
            return 0;
        } else {
            if (vetor.length % 2 == 0) {
                int posicao1 = (int) ((vetor.length / 2) - 0.5f);
                int posicao2 = (int) ((vetor.length / 2) + 0.5f);
                res = (double) ((vetor[posicao1] + vetor[posicao2]) / 2);
                return res;
            } else {

                if (vetor.length % 2 != 0) {
                    int posicao = vetor.length / 2;
                    res = (double) vetor[posicao];
                    return res;
                }
            }
        }
        return 0;
    }
}
