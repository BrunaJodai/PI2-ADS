/* 8.Solicite ao usuário diversos números (pedindo a quantidade de números previamente) e, 
em seguida, localize o maior número digitado entre todos os valores. Ao final, o programa 
deverá exibir em qual “rodada” de digitação o maior número foi digitado.*/
package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int qntd = qntdNum();

        int[] numeros = new int[qntd];
        numeros = preencheVetor(numeros);

        System.out.printf("\nO maior número foi digitado na %dª rodada.\n", rodadaMaior(numeros));

    }

    static int qntdNum() {
        System.out.print("Quantidade de números: ");
        int qntd = Integer.parseInt(console.nextLine());

        return qntd;
    }

    static int[] preencheVetor(int[] numeros) {
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numeros[i] = Integer.parseInt(console.nextLine());
        }

        return numeros;
    }

    //localiza o maior num digitado e retorna em qual rodada ocorreu (rodada = i+1), ao invés de retornar a posição no vetor
    static int rodadaMaior(int[] numeros) {
        int maiorN = numeros[0];
        int rod = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorN) {
                maiorN = numeros[i];
                rod = i;
            }
        }

        return rod + 1;
    }

}
