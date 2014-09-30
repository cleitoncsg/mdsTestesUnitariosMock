package fga.testeMock;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import fga.controle.CalculadoraControle;

public class CalculadoraControleTestMock {
	
	CalculadoraControle calculadoraControle;
	
	@Before 
	public void setup(){ 
		calculadoraControle = EasyMock.createMock(CalculadoraControle.class);
	}
	
	@Test
	public void testSoma() throws Exception { 
		EasyMock.expect(calculadoraControle.calculaSoma(5, 5)).andReturn(10.0);
		EasyMock.replay(calculadoraControle);
	}
}
