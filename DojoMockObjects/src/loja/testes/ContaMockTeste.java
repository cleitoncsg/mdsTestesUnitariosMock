package loja.testes;

import junit.framework.TestCase;
import loja.entidades.Conta;
import loja.entidades.LinhaMock;

public class ContaMockTeste extends TestCase {  
    
	public void testeTotalConta() {
		
        Conta conta = new Conta();  
        conta.adiciona(new LinhaMock(4));  
        conta.adiciona(new LinhaMock(9));   
        assertEquals(13, conta.total());  
    }  
} 
