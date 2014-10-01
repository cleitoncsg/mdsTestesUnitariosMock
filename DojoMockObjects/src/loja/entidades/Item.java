package loja.entidades;

public class Item {
	
	private String nomeItem;  
    private int precoItem;
    
    public Item() {
    	
    }

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(int precoItem) {
		this.precoItem = precoItem;
	}
    
}
