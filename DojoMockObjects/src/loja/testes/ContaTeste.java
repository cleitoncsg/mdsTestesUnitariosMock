package loja.testes;

import junit.framework.TestCase;
import loja.entidades.Conta;
import loja.entidades.Item;
import loja.entidades.LinhaItem;

public class ContaTeste extends TestCase {  
      
    public void testeTotalDaConta() {  
        
    	Conta conta = new Conta();  
  
        Item salgadinho = new Item();  
        salgadinho.setNomeItem("Salgadinho Fandangos");  
        salgadinho.setPrecoItem(2);  
  
        Item chocolate = new Item();  
        chocolate.setNomeItem("Barra de Chocolate Lacta");  
        chocolate.setPrecoItem(3);    
  
        LinhaItem linhaSalgadinho = new LinhaItem(salgadinho, 2);  
        LinhaItem linhaChocolate = new LinhaItem(chocolate, 3);
  
        conta.adiciona(linhaSalgadinho);  
        conta.adiciona(linhaChocolate);
  
        assertEquals(13, conta.total());  
    } 
}
