/*9.Escreva um programa que questione ao usuário as duas aulas que ele terá a cada dia da semana. 
Em seguida, permita que o usuário consulte quais aulas terá em determinado dia da semana ou imprima 
as aulas de todos os dias da semana. O programa só deverá ser encerrado quando o usuário digitar “sair”, 
a qualquer momento. */
package ADO1;

import java.util.Scanner;

public class Exercicio09 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        //7 linhas (1 p/ cada dia da semana) e 2 colunas (1 p/ cada aula)
        String[][] grade = new String[7][2];
        String consulta;
        boolean sair = false;

        grade = preencheAulas(grade);

        do {
            consulta = opcoesConsulta();

            if (consulta.trim().equalsIgnoreCase("sair")) {
                sair = true;
            } else {
                //se não pediu p/ sair e nem mostrar todas as aulas, converte consulta p/ int
                int dia = Integer.parseInt(consulta);
                //para pesquisar na matriz (0-6)
                if (dia >= 1 && dia <= 7) {
                    dia--;
                }

                consultaGrade(grade, dia);

            }
        } while (!sair);

    }

    static String[][] preencheAulas(String[][] grade) {
        System.out.println("~INFORME AS AULAS~");
        for (int i = 0; i < grade.length; i++) {
            imprimeDiaSemana(i);
            for (int j = 0; j < grade[i].length; j++) {
                //soma +1 p/ melhor mostrar ao usuário a aula
                System.out.printf("%dª aula: ", j + 1);
                grade[i][j] = console.nextLine();
            }
            System.out.println("");
        }

        return grade;
    }

    static String opcoesConsulta() {
        System.out.print("~MENU DE CONSULTA~\n"
                + "Encerrar: digite 'sair';\n"
                + "Semana inteira: digite 0;\n"
                + "Dia específico da semana: digite entre 1 a 7 (1-domingo/7-sábado).\n"
                + "~Digite o que deseja consultar: ");
        String consulta = console.nextLine();

        return consulta;
    }

    static void consultaGrade(String[][] grade, int dia) {
        System.out.println("\n~CONSULTA AULAS~");
        boolean tds = false;
        if (dia == 0) {
            tds = true;
        }
        for (int i = 0; i < grade.length; i++) {
            if (i == dia || tds) {
                imprimeDiaSemana(i);
                for (int j = 0; j < grade[i].length; j++) {
                    //if (i == dia || tds) {    
                    System.out.printf("%dª aula: %s\n", j + 1, grade[i][j]);
                    //}
                }
                //força a parada p/ não mostrar os proxs dias e aulas
                System.out.println("");
            }
        }
    }

    static void imprimeDiaSemana(int i) {
        //soma +1 p/ entrar no case certo
        switch (i + 1) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA-FEIRA");
                break;
            case 3:
                System.out.println("TERÇA-FEIRA");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA");
                break;
            case 5:
                System.out.println("QUINTA-FEIRA");
                break;
            case 6:
                System.out.println("SEXTA-FEIRA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
        }
    }

}
