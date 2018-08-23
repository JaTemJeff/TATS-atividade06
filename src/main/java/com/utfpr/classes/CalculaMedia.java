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

    public float calculaMedia(double vetor[]) {
        for (i = 0; i < vetor.length; i++) {
            aux = vetor[i] + aux;
        }
        return (float) (aux / vetor.length);
    }
    
    public float calculaMaior(double vetor[]){
        return 0;
    }
}
