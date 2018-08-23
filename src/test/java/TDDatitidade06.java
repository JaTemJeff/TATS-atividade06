/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
   
   @Before
   public void inicializa(){
       mediana = new CalculaMediana();
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
   
}
