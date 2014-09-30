package fga.mds.controle;

import fga.mds.modelo.Calculadora;

public class CalculadoraControle {
	
	Calculadora calculadora = new Calculadora();
	
	public double calculaSoma(Calculadora calculadora){
		
		if(calculadora.getNumero1() < 0 || calculadora.getNumero2() < 0){
			throw new IllegalArgumentException("Número negativo!");
		}
		return calculadora.getNumero1() + calculadora.getNumero2();
	}

}
