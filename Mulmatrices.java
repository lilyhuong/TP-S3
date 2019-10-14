
public class Mulmatrices {
    public static void main(String[]args) {
        int[][] mat1 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] mat2 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] matR = {{0,0,0},{0,0,0},{0,0,0}};


        //lige * colonne (somme des produits de chaque composant)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //matR[i][j] = mat[1][0] * mat2[0][j] + mat1[i][1] * mat2[1][j] + mat1[i][2] * mat2[2][J];
                for (int k = 0;k < 3;k++) {
                    matR[i][j] = matR[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }
        //afficher de la matrice résultat
        for (int i = 0; i < 3; i++) {
            System.out.println("["); //saut de ligne
            for (int j = 0; j < 3; j++) {
                System.out.println(matR[i][j] + "");
            }
            System.out.println("]"); //saut de ligne

        }


    }
}
