/* 2.Escreva um programa Java que verifique se um número digitado pelo usuário é um número e, 
caso verdadeiro, se é um número par ou ímpar, bem como um número primo. Exiba os resultados no 
console com mensagens amigáveis ao usuário. As lógicas de obtenção do número e ambas as verificações 
devem ser separadas em métodos diferentes.

verifica se é um numero
verifica se é par ou impar e primo*/
package ADO1;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int num = lerNum();
        boolean verificaPar = verificaPar(num);

        if (verificaPar) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
            if (verificaPrimo(num)) {
                System.out.println("E primo também");
            }
        }
    }

    public static int lerNum() {
        Scanner console = new Scanner(System.in);

        boolean validaNum = false;
        int num = 0;

        do {
            try {
                System.out.print("Digite um número: ");
                num = Integer.parseInt(console.nextLine());
                validaNum = true;
            } catch (NumberFormatException ex) {
                System.out.println("Por favor, digite um número.\n");
            }
        } while (!validaNum);

        return num;
    }

    public static boolean verificaPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificaPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

}
