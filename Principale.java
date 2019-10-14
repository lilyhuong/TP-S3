package Banque;

public class Principale {

	public static void main(String[] args) {
		Compe_Bancaire cb1 = new Compe_Bancaire();
		Compe_Bancaire cb2 = new Compe_Bancaire(2500.0f, "BObby", "31258GHHGG");
		cb1.affiche();
		cb2.affiche();
	}

}
