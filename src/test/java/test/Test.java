package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Achat;
import metier.Boutique;
import metier.Clien;
import metier.Console;
import metier.Jeu;
import metier.Salon;


public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Boutique b1 = new Boutique("Louis Vuitton","Avenue montaigne");
		Boutique b2 = new Boutique("Snipes","Avenue De la marche");
		
		Clien c1 = new Clien("mohammed","raki");
		Clien c2 = new Clien("mohammed1","raki1");
		


		
		// Création d'un objet client
	//	Clien c1 = new Clien("Amelia","Benlemouy");
		
		// Création d'objets console pour les constructeurs jeu
		Console ps1 = new Salon("PS1",100,null);
		Console ps2 = new Salon("PS2",100,null);
		Console nintendo = new Salon("Nintendo",100,null);
		Console ps5 = new Salon("PS5",100,null);
		
		// Création d'une boutique pour le constructeur jeu
		//Boutique b1 = new Boutique("PlayStore", "25 avenue des champs Elysée 75000 Paris");
		
		// Création des 5 pbjets jeux et affectation d'une boutique aux jeux existants
		Jeu j1 = new Jeu("GTA", ps2, b1);
		Jeu j2 = new Jeu("FIFA", ps5, b1);
		Jeu j3 = new Jeu("TAKEN", ps1, b1);
		Jeu j4 = new Jeu("Mario", nintendo, b1);
		Jeu j5 = new Jeu("Tomb Raider", ps1, b1);
		
		// Création d'objets achat pour la liste d'achats du client c1
		Achat a1 = new Achat(j1, LocalDate.parse("2022-07-21"),10.90);
		Achat a2 = new Achat(j4, LocalDate.parse("2022-07-15"),5.90);
		Achat a3 = new Achat(j5, LocalDate.parse("2022-07-07"),4.90);


		// Création de la liste d'achats affectée au client c1
		List<Achat> listeAchats = new ArrayList();
		Collections.addAll(listeAchats, a1,a2,a3);
		c1.setListeAchat(listeAchats);
		

	}

}
