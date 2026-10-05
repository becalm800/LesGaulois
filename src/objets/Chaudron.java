package objets;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion += quantite;
		this.forcePotion = forcePotion; 
	}
	
	public boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion == 0) {
			forcePotion = 1;
			return forcePotion;
		}
		else {
			quantitePotion--;
			return forcePotion;
		}
	}
		
}
