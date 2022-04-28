package EstruturaSequencial;/*Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe a 1ª Nota Bimestral: ");
            Double nota1 = scanner.nextDouble();

            System.out.print("Informe a 2ª Nota Bimestral: ");
            Double nota2 = scanner.nextDouble();

            System.out.print("Informe a 3º Nota Bimestral: ");
            Double nota3 = scanner.nextDouble();

            System.out.print("Informe a 4º Nota Bimestral: ");
            Double nota4 = scanner.nextDouble();

            double notaAnual = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A media das notas digitadas é " + notaAnual);
        }
    }
}
