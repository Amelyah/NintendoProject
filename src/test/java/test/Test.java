package test;

import metier.Boutique;
import metier.Clien;
import metier.Console;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boutique b1 = new Boutique("Louis Vuitton","Avenue montaigne");
		Boutique b2 = new Boutique("Snipes","Avenue De la marche");
		
		Clien c1 = new Clien("mohammed","raki");
		Clien c2 = new Clien("mohammed1","raki1");
		

		Console ps1 = new Console("PS1");
		Console ps2 = new Console("PS2");
		Console nintendo = new Console("Nintendo");
		Console ps5 = new Console("PS5");
		
		Jeu j1 = new Jeu("GTA", ps2);
		Jeu j2 = new Jeu("FIFA", ps5);
		Jeu j3 = new Jeu("TAKEN", ps1);
		Jeu j4 = new Jeu("Mario", nintendo);
		Jeu j5 = new Jeu("Tomb Raider", ps1);


	}

}
