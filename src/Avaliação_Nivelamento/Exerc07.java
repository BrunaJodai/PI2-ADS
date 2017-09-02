/* Desenvolva um programa que leia os nomes dos jogos eletrônicos favoritos de um usuário e suas respectivas notas de avaliação pessoal, 
com limite máximo de 10 jogos ou até que o usuário digite “sair” no nome do jogo. Valide se as informações de nota são corretas e, então, 
informe o jogo do usuário com maior nota */
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        boolean sair = false;
        int cont = 0;
        int notaMaior = 0;
        String nomeMaior = "sss";
        
        while (!sair && cont <=10) {
            System.out.print("Nome do jogo: ");
            String nome = console.nextLine();
            
            System.out.print("Nota: ");
            int nota = Integer.parseInt(console.nextLine());
            
            if (nome.equals("sair")) {
                sair = true;
            }
            if (nota >= notaMaior) {
                notaMaior = nota;
                nomeMaior = nome;
            }
            cont = cont +1;
        }
        
        System.out.println("Jogo com maior nota: " +nomeMaior);
    }
}
