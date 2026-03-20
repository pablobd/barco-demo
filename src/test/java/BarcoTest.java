import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcoTest {
    Barco barco;

    @BeforeEach
    void setUp() {
        barco = new Barco();
    }

    @Test
    void avanzar() {
        assertEquals(barco.avanzar(10), 10);
    }
}