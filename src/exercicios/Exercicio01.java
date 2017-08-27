/* 1.Escreva um programa que leia um número decimal do usuário. Após a leitura, verifique se o 
número é maior ou igual a 50,0. Caso verdadeiro, mostre a mensagem “SUCESSO”. Caso falso, mostre 
a mensagem “ERRO”. Após a verificação, saia do programa emitindo a mensagem “FIM DO PROGRAMA”, 
independentemente do resultado. Construa o programa de forma que os métodos de leitura e verificação 
fiquem separados do método principal da aplicação.*/
package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        double num = lerNum();
        boolean verificacao = verificaNum(num);

        if (verificacao) {
            System.out.println("SUCESSO!");
        } else {
            System.out.println("ERRO!");
        }

        System.out.println("~FIM DO PROGRAMA~");

    }

    public static double lerNum() {
        Scanner console = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = Double.parseDouble(console.nextLine());

        return num;
    }

    public static boolean verificaNum(double num) {
        if (num >= 50) {
            return true;
        } else {
            return false;
        }

    }

}
