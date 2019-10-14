import java.util.Scanner;
public class MoyenneNotes {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		// ensemle de table note
				float[] ensembledeNote; // déclaration d'une variable
				int nbNotes;
				float moyenne = 0.0f;
				int i;
				// saisir le tableau note
				System.out.println ("Donner le nombre de note à traiter");
				nbNotes=sc.nextInt();
				Object[] newfloat;
				ensembledeNote = new float[nbNotes];
				// boucle pour saisir toutes notes
				i = 0;
				while (i < nbNotes) {
		            System.out.println ("Donner la " + (i + 1) +"eme note");
		            ensembledeNote [i]=sc.nextFloat();
		            i++;
		        }
		        moyenne  = 0;
		        //calculer la moyennre de cet ensemble notes
		        for (i = 0; i < nbNotes; i++) {
		            moyenne = moyenne + ensembledeNote[i];
		        }
		        moyenne = moyenne/nbNotes;
		        System.out.println ("La moyenne du nombre de notes est: " + moyenne);

			}

		}

