/*Leia os seguintes dados de um cliente durante a execução do programa:
•	Nome
•	Estado Civil
•	Endereço
•	Telefone
Quando ler o último dado, exiba um resumo da ficha do cliente no console. 
Separe os métodos de leitura e exibição de informação de forma coesa*/

package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        String dados[] = new String[4];

        String[] lerDados = lerDados(dados);

        imprimirDados(dados);

    }

    static String[] lerDados(String dados[]) {
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < dados.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Nome: ");
                    break;
                case 1:
                    System.out.print("Estado Civil: ");
                    break;
                case 2:
                    System.out.print("Endereço: ");
                    break;
                case 3:
                    System.out.print("Telefone: ");
                    break;
            }
            dados[i] = console.nextLine();
        }

        return dados;
    }

    static void imprimirDados(String dados[]) {
        System.out.println("\nResumo da ficha: ");
        for (int i = 0; i < dados.length; i++) {
            System.out.println(dados[i]);
        }
    }

}
