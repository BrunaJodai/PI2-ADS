/* 3.Construa um programa que escreva por extenso um número digitado pelo usuário (ou seja, 
se o usuário digitar “9”, deverá ser exibido no console “NOVE”). O programa deve escrever os 
números por extenso de 0 a 9 e, caso o número seja negativo ou tenha mais de uma casa decimal 
(maior que 9), mostrar uma mensagem de erro. O código que efetua a leitura e a validação dos 
valores e o código que obtém o valor por extenso devem ser separados em métodos diferentes.*/
package ADO1;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int num = lerNum();
        String numExt = numExtenso(num);

        System.out.println("Número por extenso: " +numExt.toUpperCase());

    }

    public static int lerNum() {
        Scanner console = new Scanner(System.in);

        boolean validaNum = false;
        int num = 0;

        do {
            try {
                System.out.print("Digite um número: ");
                num = Integer.parseInt(console.nextLine());

                if (num > 0 && num < 9) {
                    validaNum = true;
                } else {
                    System.out.println("Número inválido. Digite algum entre 0 e 9.\n");
                }

            } catch (NumberFormatException ex) {
                System.out.println("Por favor, digite um número válido.\n");
            }
        } while (!validaNum);

        return num;
    }

    static String numExtenso(int num) {
        String numExt = "";
        switch (num) {
            case 0:
                numExt = "zero";
                break;
            case 1:
                numExt = "um";
                break;
            case 2:
                numExt = "dois";
                break;
            case 3:
                numExt = "três";
                break;
            case 4:
                numExt = "quatro";
                break;
            case 5:
                numExt = "cinco";
                break;
            case 6:
                numExt = "seis";
                break;
            case 7:
                numExt = "sete";
                break;
            case 8:
                numExt = "oito";
                break;
            case 9:
                numExt = "nove";
                break;
        }
        return numExt;
    }

}
