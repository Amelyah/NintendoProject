package metier;

import java.util.ArrayList;
import java.util.List;

public class Boutique{
	
    private String nom;
    private String Addresse;
    private List<Jeu> listeJeux = new ArrayList();
    
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
	
	public List<Jeu> getListeJeux() {
		return listeJeux;
	}

	public void setListeJeux(List<Jeu> listeJeux) {
		this.listeJeux = listeJeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Addresse=" + Addresse + ", listeJeux=" + listeJeux + "]";
	}
	
	


    
    
}

