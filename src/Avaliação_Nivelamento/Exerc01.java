/* Construa um programa que receba o valor de três notas por parâmetro de programa Java 
(parâmetros do método main), calcule a média aritmética (X + Y + Z) / 3 e exiba o resultado no console. 
Componha o programa de forma que a média seja calculada em um método separado, chamado pelo “main” 
quando o programa iniciar.*/
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        double n1 = lerNota();
        double n2 = lerNota();
        double n3 = lerNota();

        double media = calcularMedia(n1, n2, n3);

        System.out.printf("Média: %.2f \n"  ,media);

    }

    static double lerNota() {
        Scanner console = new Scanner(System.in);
        System.out.print("Nota: ");
        double n = Integer.parseInt(console.nextLine());

        return n;
    }

    static double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;

        return media;
    }

}
