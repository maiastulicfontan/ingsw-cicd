package edu.ingsw.mstulicfontan.tpCICD;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {


    @Test
    protected void sumarTest() {
        App app = new App();
        Assertions.assertEquals(7, app.sumar(2,5), "Resultado erróneo");
    }

    @Test
    protected void dividirTest() {
        App app = new App();
        Assertions.assertEquals(4, app.dividir(8,2), "Resultado erróneo");
    }
}
