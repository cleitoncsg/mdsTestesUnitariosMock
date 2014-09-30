package fga.testeUnitario;

//import org.easymock.EasyMock;
import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fga.controle.CalculadoraControle;

public class CalculadoraControleTest{
	
	CalculadoraControle calculadoraControle;
	
	@Before 
	public void setup(){ 
		calculadoraControle = new CalculadoraControle();
	}
	
	@Test
	public void testSoma() throws Exception { 
		
		try {
			assertEquals(10, calculadoraControle.calculaSoma(5, 5), 0.001);
		} catch (Exception e) {
			
		}	
	}

	@Test
	public void testSomaComExcecao() throws Exception {
		try {
			assertEquals(-10, calculadoraControle.calculaSoma(-5, -5), 0.001);
		} catch (Exception e) {
			
		}
	}
}
