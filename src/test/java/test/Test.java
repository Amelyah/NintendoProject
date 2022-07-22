package test;

import metier.Jeu;
import metier.Console;


public class Test {

	public static void main(String[] args) {
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
