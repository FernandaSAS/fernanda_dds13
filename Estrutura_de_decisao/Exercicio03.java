package Estrutura_de_decisao;

import java.util.Scanner;

/*
System.out.print("Digite o número referente ao dia da semana: ");
Imprima o nome do dia da semana (domingo, segunda-feira, etc.)
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da Semana: ");
        double diaSemana = scanner.nextDouble();
        if (diaSemana == 1) {
            String domingo;
            System.out.println("domingo");
        } else if (diaSemana == 2) {
            String segunda;
            System.out.println("segunda");
        } else if (diaSemana == 3) {
            String terca;
            System.out.println("terça");
        } else if (diaSemana == 4) {
            String quarta;
            System.out.println("quarta");
        } else if (diaSemana == 5) {
            String quinta;
            System.out.println("quinta");
        } else if (diaSemana == 6) {
            String sexta;
            System.out.println("sexta");
        } else if (diaSemana == 7) {
            String sabado;
            System.out.println("sabado");
        }
        scanner.close();
    }
}