package metier;

import java.time.LocalDate;

public abstract class  Console  {

	private String nom;
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	private int prix ;
	private LocalDate date;
	

	public Console(String nom, int prix, LocalDate date) {
		this.nom = nom;
		this.date = date;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
