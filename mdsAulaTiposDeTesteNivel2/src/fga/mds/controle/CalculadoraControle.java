package fga.mds.controle;

import fga.mds.excecao.ValidaCalculadora;
import fga.mds.modelo.Calculadora;

public class CalculadoraControle {
	
	Calculadora calculadora = new Calculadora();
	ValidaCalculadora validaCalculadora = new ValidaCalculadora();
	
	public double calculaSoma(Calculadora calculadora) throws Exception{
		
		if(calculadora.getNumero1() < 0 || calculadora.getNumero2() < 0){
			validaCalculadora.validaNumeroNegativos();
		}
		return calculadora.getNumero1() + calculadora.getNumero2();
	}

}
