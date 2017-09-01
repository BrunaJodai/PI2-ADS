/* 5.Construa um programa Java que gere um número aleatório (utilizando a classe java.util.Random) 
e peça que o usuário adivinhe o número. O programa deverá ler dados do usuário até que ele acerte o 
número (exibindo uma mensagem de sucesso) ou ele digite “desistir” (onde uma mensagem de falha junto 
ao número que deveria ser adivinhado deverá ser exibida). Separe a lógica dos métodos de forma coesa. */
package ADO1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Random aleat = new Random();
        int x = aleat.nextInt(31);
        //System.out.println("num sorteado " +x);

        boolean sair = false;
        int tent = 1;

        while (!sair) {
            //a cada 5 tentativas exibe a msg dica para caso o usuário queira desistir
            if (tent % 5 == 0) {
                System.out.println("\n--- Caso queira parar, digite 'desistir' ---\n");
            }

            System.out.println("~Tentativa " + tent);
            System.out.print("Tente adivinhar o número (0 a 30): ");
            String num = console.nextLine();

            if (num.toLowerCase().equals("desistir")) {
                System.out.println("Você desistiu. O número era " + x);
                sair = true;
            } else {
                //caso o usuário não tenha digitado "desistir", converte a string em int
                int n = Integer.parseInt(num);

                if (n == x) {
                    System.out.println("\nPARABÉNS. ACERTOU! /õ/");
                    sair = true;
                } else if (n != x) {
                    System.out.println("Não foi desta vez. Tente de novo!\n");
                }
            }
            tent++;
        }
    }

}
