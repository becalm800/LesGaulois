package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour " + obelix.getNom() + ".");
		obelix.parler("Bonjour " + asterix.getNom() + ". Ca te dirais d'aller chasser des sangliers?)");
		asterix.parler("Oui très bonne idée.");
		
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
		
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
	}
}
