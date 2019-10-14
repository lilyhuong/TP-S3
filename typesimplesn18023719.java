import java.util.Scanner;
public class typesimplesn18023719 {

	public static void main(String[] args) {
		//initialisation du scanner
		Scanner sc = new Scanner(System.in);
		//saisie  affichage d'une chaine caractere
		String s; //non initialisée;
		System.out.println("Merci de saisir la chaine de caractère");
		s = sc.next(); // seulement un mot il s'arrete au premier espace
		System.out.println("La chaine de cararctère est" + s);
		
		
		//saisie et affichage d'un entier
		int i;
		System.out.println("Saisir un entier");
		i = sc.nextInt();
		System.out.println("L'entier saisir est: " + i);
		
		//saisie et affichage d'un réel
		float n;
		System.out.println("Saisir un nombre réel:");
		n = sc.nextFloat();
		System.out.println("le nombre réel est:" + n );
		
		//saisie une caractère
		char c;
		String s2;
		System.out.println("Saisir votre caractère:");
		s2 = sc.next();
		c = s2.charAt(0); //charAT retourne la cqractère situé à l'
		System.out.println("La valeur de caractère ets: " + c);
		
		
		//saisie affichage d'unr booléen
		boolean bb;
		System.out.println("Saisir un booléen: ");
		bb = sc.nextBoolean();
		System.out.println("Valeur de ");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
