package dpoo.test;

import dpoo.mundo.Parcial;
import dpoo.presentacion.Principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParcialTest {

	private Parcial parcial;

	@BeforeEach
	public void setUp() {
		parcial = new Parcial();
	}

	@Test
    public void testPotenciaCasoNormal() throws Exception {
        assertEquals(32, parcial.potencia(2, 5));
    }

    @Test
    public void testPotenciaBaseUno() throws Exception {
        assertEquals(1, parcial.potencia(1, 100));
    }

    @Test
    public void testPotenciaBaseDiez() throws Exception {
        assertEquals(1000, parcial.potencia(10, 3));
    }


    @Test
    public void testPotenciaExponenteCero() throws Exception {
        assertEquals(1, parcial.potencia(5, 0));
    }

    @Test
    public void testPotenciaExponenteCeroBaseNegativa() throws Exception {
        assertEquals(1, parcial.potencia(-5, 0));
    }


    @Test
    public void testPotenciaBaseCero() throws Exception {
        assertEquals(0, parcial.potencia(0, 5));
    }

    @Test
    public void testPotenciaCeroElevadoACero() throws Exception {
        assertEquals(1, parcial.potencia(0, 0));
    }


    @Test
    public void testPotenciaBaseNegativaExponentePar() throws Exception {
        assertEquals(16, parcial.potencia(-2, 4));
    }

    @Test
    public void testPotenciaBaseNegativaExponenteImpar() throws Exception {
        assertEquals(-8, parcial.potencia(-2, 3));
    }


    @Test
    public void testPrincipalConstructor() {
        assertDoesNotThrow(() -> new Principal());
    }

    @Test
    public void testPrincipalMain() {
        assertDoesNotThrow(() -> Principal.main(new String[]{}));
    }
}