package metier;

public class Boutique{
    private String nom;
    private String Addresse;
    public Boutique(String nom, String Addresse){
        
        this.nom= nom;
        this.Addresse=Addresse;
        
             
    }    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddresse() {
		return Addresse;
	}

	public void setAddresse(String addresse) {
		Addresse = addresse;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Addresse=" + Addresse + "]";
	}


    
    
}

