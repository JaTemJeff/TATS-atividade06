/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.classes;

/**
 *
 * @author Notebook
 */
public class CalculaMedia {

    int i;
    double aux = 0;
    double maior = 0;
    double menor = 100000000000000000000000000000000000d;

    public double calculaMedia(double vetor[]) {
        for (i = 0; i < vetor.length; i++) {
            aux = vetor[i] + aux;
        }
        return (double) (aux / vetor.length);
    }

    public double calculaMaior(double vetor[]) {
        for (i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return (double) maior;
    }

    public double calculaMenor(double vetor[]) {
        for (i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        return (double) menor;
    }

    public double calculaNumeroDeValoresAcimaDaMedia(double[] vetor) {
        maior = calculaMedia(vetor);
        aux = 0;
        for (i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                aux = aux + 1;
            }
        }
        return aux;
    }

    public double calculaNumeroDeValoresAbaixoDaMedia(double[] vetor) {
        menor = calculaMedia(vetor);
        aux = 0;
        for (i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                aux = aux + 1;
            }
        }
        return aux;
    }
    
    
}
