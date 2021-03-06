import com.utfpr.classes.CalculaDesvioPadrao;
import com.utfpr.classes.MaioresEMenores;
import com.utfpr.classes.CalculaMedia;
import com.utfpr.classes.CalculaMediana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TDDatitidade06 {

    CalculaMediana mediana;
    CalculaMedia media;
    CalculaDesvioPadrao desvio;
    MaioresEMenores calcula;

    @Before
    public void inicializa() {
        mediana = new CalculaMediana();
        media = new CalculaMedia();
        desvio = new CalculaDesvioPadrao();
        calcula = new MaioresEMenores();
    }

    @Test
    public void testeVetorOrdenadoImpar() {
        double vetor[] = {1, 2, 3, 4, 5};
        double res = mediana.calculaMediana(vetor);
        Assert.assertEquals(3, res, 0.1);
    }

    @Test
    public void testeVetorOrdenadoPar() {
        double vetor[] = {1, 2, 3, 4};
        double res = mediana.calculaMediana(vetor);
        Assert.assertEquals(2.5, res, 0.1);
    }

    @Test
    public void testeMedia() {
        double vetor[] = {10, 10};
        double res = media.calculaMedia(vetor);
        Assert.assertEquals(10, res, 0.1);
    }

    @Test
    public void testeMaior() {
        double vetor[] = {1, 2, 3};
        double res = media.calculaMaior(vetor);
        Assert.assertEquals(3, res, 0.1);
    }

    @Test
    public void testeMenor() {
        double vetor[] = {1, 2, 3};
        double res = media.calculaMenor(vetor);
        Assert.assertEquals(1, res, 0.1);
    }

    @Test
    public void testeNumeroDeValoresAcimaDaMedia() {
        double vetor[] = {1, 2, 3, 4};
        double res = media.calculaNumeroDeValoresAcimaDaMedia(vetor);
        Assert.assertEquals(2, res, 0.1);
    }

    @Test
    public void testeNumeroDeValoresAbaixoDaMedia() {
        double vetor[] = {1, 2, 3, 4, 1};
        double res = media.calculaNumeroDeValoresAbaixoDaMedia(vetor);
        Assert.assertEquals(3, res, 0.1);
    }

    @Test
    public void testeCalculaDesvioPadrao() {
        double vetor[] = {1, 2, 3, 4, 1};
        double res = desvio.calculaDesvio(vetor);
        Assert.assertEquals(1.3038, res, 0.1);
    }

    @Test
    public void testeNMaioresENMenores() {
        double vetor[] = {1, 2, 3, 4, 11, 10};
        double res[] = new double[4];
        double esperado[] = {1, 2, 11, 10};// Retorna os 2 menores (1 e 2) e os 2 maiores (11 e 10)
        res = calcula.maioresValores(vetor, 2);
        Assert.assertArrayEquals(esperado, res, 0);
    }
}
