/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.utfpr.classes.CalculaMedia;
import com.utfpr.classes.CalculaMediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook
 */
public class TDDatitidade06 {
   CalculaMediana mediana;
   CalculaMedia media;
   
   @Before
   public void inicializa(){
       mediana = new CalculaMediana();
       media = new CalculaMedia();
   }
   
   @Test
   public void testeVetorOrdenadoImpar(){
       double vetor[] = {1, 2, 3, 4, 5};
       double res = mediana.calculaMediana(vetor);
       Assert.assertEquals(3, res, 0.1);
   }
   
   @Test 
   public void testeVetorOrdenadoPar(){
       double vetor[] = {1, 2, 3, 4};
       double res = mediana.calculaMediana(vetor);
       Assert.assertEquals(2.5, res, 0.1);
   }
   
   @Test
   public void testeMedia(){
       double vetor[] = {10, 10};
       double res = media.calculaMedia(vetor);
       Assert.assertEquals(10, res, 0.1);
   }
   
   @Test
   public void testeMaior(){
       double vetor[] = {1, 2, 3};
       double res = media.calculaMaior(vetor);
       Assert.assertEquals(3, res, 0.1);
   }
   
   @Test
   public void testeMenor(){
       double vetor[] = {1, 2, 3};
       double res = media.calculaMenor(vetor);
       Assert.assertEquals(1, res, 0.1);
   }
   
   @Test 
   public void testeNumeroDeValoresAcimaDaMedia(){
       double vetor[] = {1, 2, 3};
       double res = media.calculaNumeroDeValoresAcimaDaMedia(vetor);
       Assert.assertEquals(1, res, 0.1);
   }
}
