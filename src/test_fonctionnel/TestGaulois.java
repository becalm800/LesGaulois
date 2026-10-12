package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		
		Druide panomarix = new Druide("Panoramix", 2);
		
		asterix.parler("Bonjour " + obelix.getNom() + ".");
		obelix.parler("Bonjour " + asterix.getNom() + ". Ca te dirais d'aller chasser des sangliers?)");
		asterix.parler("Oui très bonne idée.");
		
		System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus.getNom() + ".");
		System.out.println();
		
		
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
		System.out.println();
		
		
		panomarix.fabriquerPotion(4, 3);
		panomarix.booster(obelix);
		panomarix.booster(asterix);
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
		
	}
}
