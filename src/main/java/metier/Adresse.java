package metier;

public class Adresse{
      
    private int numero;
    
    private String rue;
    private String ville;
    
    public Adresse(int numero, String rue, String ville){
        
        this.numero= numero;
        this.ville=ville;
        this.rue=rue;
            
        
        
        
        
    }
    
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Addresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
	}

	
    
    
}
