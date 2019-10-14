package Banque;

public class Compe_Bancaire {
	// cette classe n'aura pas de main
	//attributes de la class
	float solde;
	String porteur;
	String IBAN;
	
	//fonction (méthode de la classe )
	// le premier des fonctions c'est le constructeur
	public Compe_Bancaire() {
		// initialsation les attributs
		this.solde = 0.0f;
		this.porteur = "";
		this.IBAN = "";
	
		
	}
	public Compe_Bancaire(float solde, String nom, String IBAN) {
		this.solde = solde;
		this.porteur = nom;
		this.IBAN = IBAN;
			
	}
	 //autre methode de la class
	//affichage du compte bancaire
	public void affiche () {
		System.out.println("Nom du porteur du compte: " + this.porteur);
		System.out.println("numéro du compte: " + this.IBAN);
		System.out.println("Solde du compte: " + this.solde);
	}
}
