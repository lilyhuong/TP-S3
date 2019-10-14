import java.util.Scanner;


public class PGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1,nb2,r;
		Scanner lecture = new Scanner(System.in);
		System.out.print("Entrer 1er entier :");
		nb1=lecture.nextInt();
		System.out.print("Entrer 2eme entier :");
		nb2=lecture.nextInt();
		do{
			r=nb1%nb2;
			nb1=nb2;
			nb2=r;
			
		}while(r!=0);
		System.out.println("Le PGCD des deux nombres est " +nb1);

	}

}

