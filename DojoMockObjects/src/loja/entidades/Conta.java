package loja.entidades;

public class Conta {
	
    private int valorTotal;  
  
    public void adiciona(LinhaItem linhaItem) {  
        valorTotal += linhaItem.total();  
    }
    
    public void adiciona(LinhaMock linhaMock) {
    	valorTotal += linhaMock.total();
    }
    
    public int total() {  
        return valorTotal;  
    }  
}  
