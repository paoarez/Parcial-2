import java.util.*;

public class Matriz_Ejemplo1 {

    public static void main(String args[]) {
        // main
        Scanner entrada = new Scanner(System.in);
        System.out.print("Num. de renglones:  ");
        int r = entrada.nextInt();
        System.out.print("Num. de columnas:  ");
        int c = entrada.nextInt();
        int M1[][] = new int[r][c];
        int M2[][] = new int[r][c];
        int M3[][] = new int[r][c];

        MatrizBasica matriz1 = new MatrizBasica();
        M1 = matriz1.crear(r, c);
        matriz1.imprimir(M1, " 1");
        M2 = matriz1.crear(r, c);
        matriz1.imprimir(M2, " 2");

        for (int i = 0; i < M1.length; i++) { // renglones
            for (int j = 0; j < M1[0].length; j++) { // columnas
                M3[i][j] = M1[i][j] + M2[i][j];
            } // columnas
        } // renglones
        matriz1.imprimir(M3, "Resultante");
        matriz1.porEscalar(M1, 2);
        matriz1.imprimir(M1, "multiplicada por escalar");
    }

    static class MatrizBasica {
        public int[][] crear(int n, int m) {
            int mat[][] = new int[n][m];
            Random rnd = new Random();
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = rnd.nextInt(10) + 1;
                }
            }
            return mat;
        }

        public void leerMatriz(int mat[][]) {
            Scanner entrada = new Scanner(System.in);

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print("Ingresa el dato " + i + " con " + j + ":  ");
                    mat[i][j] = entrada.nextInt();
                }
            }
        }

        public void imprimir(int mat[][], String nombre) {
            System.out.println("\n Matriz " + nombre);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] + " ");
                System.out.println();
            }

        }

        public void porEscalar(int mat[][], int e) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = e * mat[i][j];
                }
            }
        }
    }
}