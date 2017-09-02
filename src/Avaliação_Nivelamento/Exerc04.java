/* Faça um programa que leia a idade do usuário e liste suas permissões legais, tendo como base os seguintes marcos legais:
a)Dirigir: >= 18 anos
b)Beber: >= 18 anos
c)Voto facultativo: >= 16 anos, < 18 anos e >= 70 anos
d)Voto obrigatório: >= 18 anos e < 70 anos */
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        int idd = lerIdade();

        permissoes(idd);

    }

    static int lerIdade() {
        Scanner console = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idd = Integer.parseInt(console.nextLine());

        return idd;
    }

    static void permissoes(int idd) {
        System.out.println("\nPERMISSÕES LEGAIS: ");
        if (idd >= 18) {
            System.out.println("Dirigir;");
            System.out.println("Beber;");
            if (idd < 70) {
                System.out.println("Voto obrigatório.");
            }
        } else if (idd >= 16 || idd >= 70) {
            System.out.println("Voto facultativo.");
        }
    }
}
