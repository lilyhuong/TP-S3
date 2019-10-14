package TP1;
import java.util.Scanner;
public class Pendu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String leMot = "java";
		char[] res; //tableau des lettres découvre
		int nbMaxEssai; //nombre max d'essai permis
		int nbEssai;
		int nblettrestrouvees = 0;
		boolean fin = false;
		char c;
		
		//initialisation de nbessai taille du mot + 2
		nbMaxEssai = leMot.length() + 2;
		//initialisation du tableau des letttres découvertres
		res = new char[leMot.length()];
		for (int j = 0; j < res.length; j++) {
			res[j] = '_' ;
		}
		// le user propose des lettres tant qu'il n'a pas trouvé atteint l
		// nombre max d'essai
		nbEssai = 0;
		while ((nbEssai < nbMaxEssai) && (fin == false)) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[j] + "");
			}
			// il faut que 2 conditions soient vraies pour continuer
			System.out.println(" Nombre d'essai restants " + (nbMaxEssai - nbEssai));
			System.out.println("Saississez une lettre");
			c = (sc.nextLine()).charAt(0); // recup de la lettre saisie
			
			if (leMot.indexOf(c) != -1) {
				//si le cacractère est dans le mot
				for (int j = 0; j < leMot.length(); j++) {
					//pour tout les caractères du mots on test d'il cprrespondance
					// à celui proposé par le user
					if (leMot.charAt(nbEssai) == c) {
						res[j] = c;
						nblettrestrouvees = nblettrestrouvees + 1;
						
					}
				}//fin du for
			}
			else {
				System.out.println("La lettre n'est pas dans le mot");	
			}
			nbEssai = nbEssai + 1; //on incrémente le nombre d'essai
		// 
			if (nblettrestrouvees == leMot.length()) {
				System.out.println("bravo");
				fin = true; //sortir la boucle
				
			}
			// cas ou le jouer a perdu
			System.out.println (">>>>>>>>>>>>>>>>" + nbEssai);
			if (nbMaxEssai > (leMot.length() + 2)) {
				System.out.println ("Désole vous avez Perdu");
				System.out.println("Le mot était: " + leMot);
			}
		
		}
	}
}
