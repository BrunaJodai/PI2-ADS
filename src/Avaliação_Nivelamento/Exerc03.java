/*Leia os parâmetros diaUtil (boolean) e emFerias (boolean) durante a execução do programa.
Com base nos dados, faça um programa que informe se o usuário pode dormir até mais tarde. 
Isto só pode acontecer caso não seja um dia útil ou ele esteja de férias*/
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean dormir = false;

        System.out.print("INFORME O DIA: \n"
                + "(1) Dia útil; \n"
                + "(2) Férias. \n"
                + "Digite a opção: ");
        int opcao = Integer.parseInt(console.nextLine());

        switch (opcao) {
            case 1:
                dormir = false;
                break;
            case 2:
                dormir = true;
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA.");
        }

        System.out.println("");

        if (opcao == 1 || opcao == 2) {
            if (dormir) {
                System.out.println("PODE DORMIR ATÉ TARDE");
            } else {
                System.out.println("NÃO PODE DORMIR ATÉ TARDE!!!");
            }
        }
    }

}
