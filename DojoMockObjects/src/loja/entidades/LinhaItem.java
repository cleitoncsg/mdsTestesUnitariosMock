package loja.entidades;

public class LinhaItem {
	
    private Item item;  
    private int quantidade;  
  
    public LinhaItem(Item item, int quantidade) {  
        this.item = item;  
        this.quantidade = quantidade;  
    }  
    
    public int total() {  
        return item.getPrecoItem() * quantidade;  
    }  
} 
