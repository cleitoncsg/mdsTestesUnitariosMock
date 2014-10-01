package loja.entidades;

public class LinhaMock implements Linha {  
    
	private int total;  
  
    public LinhaMock(int total) {  
        this.total = total;  
    }  
      
    public int total() {  
        return total;  
    }  
}
