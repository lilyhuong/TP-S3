
public class CodeCesar {

	public static void main(String[] args) {
		String message = "Rendez vous au zoo";
		String msgcrypt = ""; // message crypté construits  à partir de bonjour, initialisation
		char crt, newcrt; // le cacractère courant
		int i;
		int dec = 1; // le nombre de cacractère de décaler
		int base = 97; // le premier carcatère en minuscule;
		// pour tout les caractère du mot (la fonction length donne la taille de la chaine
		for (int k = 0; k < message.length(); k++) {
			crt = message.charAt(k);
			if (crt != ' ') { //si le carcère n'est pas un espace
			if (Character.isLowerCase(crt)) {
				base = 97;
			}
			else {
				base = 65;
			}
			i = (int) crt; // on place dans i la valeur entière du caractère z
			i = i - base; // i = 122 - 97 = 25
			i = (i + dec) % 26;
			i = i + base;
			newcrt = (char) i;	
			}
			else {
				newcrt = crt;
			}
			msgcrypt = msgcrypt + newcrt;
		}
		System.out.println("Le message crypté est: " + msgcrypt);

	}

}
