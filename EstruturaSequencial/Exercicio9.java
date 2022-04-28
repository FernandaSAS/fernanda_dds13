package EstruturaSequencial;/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
temperatura em graus Celsius.
C = 5 * ((F-32) / 9).*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsios = (fahrenheit - 32)/1.8;
        System.out.println("A temperatura em Celsios é " + celsios);
        scanner.close();
    }
}
