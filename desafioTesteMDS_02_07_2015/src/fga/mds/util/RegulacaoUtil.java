package fga.mds.util;

import fga.mds.excecao.ContaExcecao;

public class RegulacaoUtil {
	
	ContaExcecao contaExcecao = new ContaExcecao();
	
	public double taxaImpostoOperacaoFinanceira(double valorEmDinheiroConta) throws Exception{
		
		if(valorEmDinheiroConta < 0){
			contaExcecao.lancaExcecao();
		}
		
		return valorEmDinheiroConta*0.06;
	}

}
