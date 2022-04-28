package Estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio03switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da Semana: ");
        Integer diaSemana = scanner.nextInt();
        String dia;
        switch (diaSemana) {
            case 1: dia = "domingo";
                break;
            case 2: dia = "segunda";
                break;
            case 3: dia = "terça";
                break;
            case 4: dia = "quarta";
                break;
            case 5: dia = "quinta";
                break;
            case 6: dia = "sexta";
                break;
            case 7: dia = "sabado";
                break;
            default: dia = "Invalido";
        }
        System.out.println("O dia Esolhido foi "+ dia);
        scanner.close();
    }
}
