/*9.Escreva um programa que questione ao usuário as duas aulas que ele terá a cada dia da semana. 
Em seguida, permita que o usuário consulte quais aulas terá em determinado dia da semana ou imprima 
as aulas de todos os dias da semana. O programa só deverá ser encerrado quando o usuário digitar “sair”, 
a qualquer momento. */
package ADO1;

import java.util.Scanner;

public class Exercicio09 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static String[][] preencheAulas(String[][] grade) {
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                grade[i][j] = console.nextLine();
            }
        }

        return grade;
    }

}
