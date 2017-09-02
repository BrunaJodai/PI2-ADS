/*Crie um programa que leia um número e calcule seu valor fatorial (exemplo: 5! = 5 x 4 x 3 x 2). 
Com o resultado, o programa deve informar se o número do usuário é um número primo */
package Avaliação_Nivelamento;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        int n = lerNum();
        int fatorial = fatorial (n);
        
        System.out.println("Fatorial: " +fatorial);
    }
    
    static int lerNum () {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        int n = Integer.parseInt(console.nextLine());
        
        return n;
    }
    
    static int fatorial (int n) {
        int fatorial=1;
        for (int i = n; i > 1; i--) {
            fatorial = fatorial * i;
        }
        
        return fatorial;
    }
}
