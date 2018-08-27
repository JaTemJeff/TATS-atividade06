/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.classes;

import com.utfpr.classes.CalculaMedia;
import java.util.Arrays;

/**
 *
 * @author Notebook
 */
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
