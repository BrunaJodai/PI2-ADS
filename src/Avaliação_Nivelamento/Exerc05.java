/* Crie um programa que leia números do usuário até que seja digitado um caractere não numérico. 
A cada leitura, o programa deve dizer se o número é par ou ímpar */
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean validacao = false;

        try {
            validacao = true;
            while (validacao) {
                System.out.print("Número: ");
                int n = Integer.parseInt(console.nextLine());

                if (n % 2 == 0) {
                    System.out.println("PAR.");
                } else {
                    System.out.println("ÍMPAR.");
                }
                System.out.println("");
            }
        } catch (NumberFormatException exe) {
            System.out.println("CARACTERE NÃO NUMÉRICO.");
        }
    }
}
