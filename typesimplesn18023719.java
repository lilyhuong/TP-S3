import java.util.Scanner;
public class typesimplesn18023719 {

	public static void main(String[] args) {
		//initialisation du scanner
		Scanner sc = new Scanner(System.in);
		//saisie  affichage d'une chaine caractere
		String s; //non initialis�e;
		System.out.println("Merci de saisir la chaine de caract�re");
		s = sc.next(); // seulement un mot il s'arrete au premier espace
		System.out.println("La chaine de cararct�re est" + s);
		
		
		//saisie et affichage d'un entier
		int i;
		System.out.println("Saisir un entier");
		i = sc.nextInt();
		System.out.println("L'entier saisir est: " + i);
		
		//saisie et affichage d'un r�el
		float n;
		System.out.println("Saisir un nombre r�el:");
		n = sc.nextFloat();
		System.out.println("le nombre r�el est:" + n );
		
		//saisie une caract�re
		char c;
		String s2;
		System.out.println("Saisir votre caract�re:");
		s2 = sc.next();
		c = s2.charAt(0); //charAT retourne la cqract�re situ� � l'
		System.out.println("La valeur de caract�re ets: " + c);
		
		
		//saisie affichage d'unr bool�en
		boolean bb;
		System.out.println("Saisir un bool�en: ");
		bb = sc.nextBoolean();
		System.out.println("Valeur de ");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
