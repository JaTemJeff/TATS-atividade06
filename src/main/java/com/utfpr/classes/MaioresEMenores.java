package com.utfpr.classes;

import com.utfpr.classes.CalculaMedia;
import java.util.Arrays;

public class MaioresEMenores {

    CalculaMedia media = new CalculaMedia();

    public double[] maioresValores(double vetor[], int n) {
        double vetorMaior[] = new double[n];
        double vetorMenor[] = new double[n];
        int i = 0;

        Arrays.sort(vetor);
        int aux = vetor.length - 1;

        for (i = 0; i < n; i++) {
            vetorMaior[i] = vetor[aux];
            vetorMenor[i] = vetor[i];
            aux--;
        }
        double vetorResultado[] = new double[vetorMaior.length + vetorMenor.length];
        System.arraycopy(vetorMenor, 0, vetorResultado, 0, vetorMenor.length);
        System.arraycopy(vetorMaior, 0, vetorResultado, vetorMenor.length, vetorMaior.length);

        return vetorResultado;
    }
}
