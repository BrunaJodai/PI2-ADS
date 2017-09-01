/*10.Construa um programa que permita a elaboração deduas matrizes de mesmo tamanho 
(n por n) e, em seguida, exiba e calcule a soma destas matrizes. */
package ADO1;

import java.util.Scanner;

public class Exercicio10 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = lerTamMatriz();

        int[][] m1 = new int[tam][tam];
        int[][] m2 = new int[tam][tam];
        int[][] soma = new int[tam][tam];

        System.out.println("MATRIZ 1");
        m1 = populaMatriz(m1);
        System.out.println("\nMATRIZ 2");
        m2 = populaMatriz(m2);

        somaMatrizes(m1, m2, soma);

        System.out.println("\nSOMA DAS 2 MATRIZES");
        imprimeMatriz(soma);

    }

    //lê o tamanho da matriz
    static int lerTamMatriz() {
        System.out.print("Tamanho da matriz: ");
        int tam = Integer.parseInt(console.nextLine());

        return tam;
    }

    static int[][] populaMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                m[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        return m;
    }

    static int[][] somaMatrizes(int[][] m1, int[][] m2, int[][] soma) {
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return soma;
    }

    static void imprimeMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d][%d]: %d\n", i, j, m[i][j]);
            }
        }
    }

}
