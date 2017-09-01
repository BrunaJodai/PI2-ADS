/* 4.Elabore um programa que solicite 5 números do usuário utilizando alguma forma de repetição 
(while, do...while ou for). Em seguida, calcule a média aritmética do valor e exiba as seguintes 
mensagens de acordo com os critérios abaixo:
a.Se a média for menor que 5, exibir “REPROVADO”
b.Se a média for maior ou igual a 5 e menor que 9, exibir “APROVADO”
c.Se a média for 9, exibir “PARABÉNS”
d.Se a média for 10, exibir “MASTER OF THE UNIVERSE” */
package ADO1;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        double[] notas = new double[5];

        notas = preencheNotas(notas);
        double media = mediaNotas(notas);
        
        //System.out.println("Média: " +media); 
        if (media < 5) {
            System.out.println("REPROVADO!");
        } else if (media >= 5 && media < 9) {
            System.out.println("APROVADO!");
        } else if (media == 9) {
            System.out.println("PARABÉNS!");
        } else if (media == 10) {
            System.out.println("MASTER OF THE UNIVERSE!");
        } else {
            System.out.println("OPS, ALGO DEU ERRADO.");
        }

    }

    static double[] preencheNotas(double[] notas) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota [%d]: ", i);
            notas[i] = Double.parseDouble(console.nextLine());
        }
        return notas;
    }

    static double mediaNotas(double[] notas) {
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
            //System.out.println("soma: " + somaNotas);
        }
        return (somaNotas / notas.length);
    }

}
