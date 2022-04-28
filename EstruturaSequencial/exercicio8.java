package EstruturaSequencial;/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/


import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por Hora? ");
        double hora = scanner.nextDouble();
        double dia = hora*8;
        double mes = dia*30;
        System.out.println("Você ganha por dia o valor de R$ " +dia+ ".");
        System.out.println("Você ganha por mês o valor de R$ " +mes+ ".");
        scanner.close();
    }

}
