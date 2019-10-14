import java.util.Scanner;
public class palindrome {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un mot");
		String s = sc.next();
		int i, N;
		N = s.length();
		
		//Vérification palindrome
		i = 0;
		while(i < N) {
			if (s.charAt(i) == s.charAt(N - i - 1)) {
				System.out.println ("Votre motre n'est palindrome");
				i++;
			}
			else {
				System.out.println("Votre mot n'est pas palindrome");
			return;	
			}
		}
		
		
	}
}
