import java.util.Scanner;
public class Suitearithm�tiquen18023719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int u0 = 1;
		int Un;
		int n; //le rang de lma valeur cherch�e par l'utilisateur
		int i;
		System.out.println("Saisir le rang cherch�e: ");
		n = sc.nextInt();
		Un = u0;
		i = 1;
		
		//calcul du ni�me term de la suite
		while (i <= n) { // si n == 0 alors ce test est faux
			Un = 2*Un + 3; //equivalent Un+1 = 2Un + 3
			i = i + 1; //ce qui ets � droit du signe �gal est trait�
						// avant l'effectation � i
			
		}
		System.out.println("La valeur de la suite est: " + Un);
		
	} //fin du main
} // fin du class
