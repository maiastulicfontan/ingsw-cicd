package edu.ingsw.mstulicfontan.tpCICD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        this.app = new App();
    }

    @Test
    protected void sumarTest() {
        Assertions.assertEquals(7, app.sumar(2,5), "Resultado erroneo");
        Assertions.assertEquals(4, app.sumar(4,0), "Resultado erroneo");
        Assertions.assertEquals(2, app.sumar(-1, 3), "Resultado erroneo");
    }

    @Test
    protected void dividirTest() {
        Assertions.assertEquals(4, app.dividir(8,2), "Resultado erroneo");
    }
}
