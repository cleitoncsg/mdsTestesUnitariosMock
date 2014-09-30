package fga.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fga.controle.CalculadoraControle;

public class CalculadoraControleTest {

	public CalculadoraControle calculadoraControle;
	
	@Before
	public void setup(){
		calculadoraControle = new CalculadoraControle();
	}

	@Test
	public void testCalculoSoma() {
		assertEquals(10, calculadoraControle.calculoSoma(8, 2), 0.0001);
	}

}
