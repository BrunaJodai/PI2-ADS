/* 7.Elabore um programa que calcule a média geral de uma sala. Para isso, 
solicite ao usuário a quantidade de alunos e, em seguida, a média final de 
cada um deles. Ao término, calcule a média da sala e a exiba ao usuário.*/
package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int qntd = qntdAlunos();
        //cria o vetor com o tamanho da qntd informada
        double[] notasAlunos = new double[qntd];
        notasAlunos = preencheNotasAlunos(notasAlunos);

        double media = mediaNotas(notasAlunos);

        System.out.printf("\nMédia da sala: %.2f\n", media);

    }

    static int qntdAlunos() {
        System.out.print("Quantidade de alunos: ");
        int qntd = Integer.parseInt(console.nextLine());

        return qntd;
    }

    //apresenta-se o num do aluno ao usuário e não a posição em que vai preencher no vetor
    static double[] preencheNotasAlunos(double[] notas) {
        System.out.println("\n-- INFORME AS NOTAS --");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%dº aluno: ", (i + 1));
            notas[i] = Double.parseDouble(console.nextLine());
        }

        return notas;
    }

    static double mediaNotas(double[] notas) {
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        return somaNotas / notas.length;
    }

}
