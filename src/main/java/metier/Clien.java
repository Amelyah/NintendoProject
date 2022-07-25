package metier;

import java.util.ArrayList;
import java.util.List;

public class Clien {
	private String nom;
	private String prenom;
	private List<Achat> listeAchats = new ArrayList();
	
	public Clien(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Achat> getListeAchat() {
		return listeAchats;
	}

	public void setListeAchat(List<Achat> listeAchats) {
		this.listeAchats = listeAchats;
	}

	@Override
	public String toString() {
		return "Clien [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}
	
	
	

}
