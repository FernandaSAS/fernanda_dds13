package EstruturaSequencial;/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o raio desejado: ");
            Double raio = scanner.nextDouble();
            double pi = 3.14;
            double raioAoQuadrado = raio*raio;
            double area = pi * raioAoQuadrado;
            System.out.println("A Area do Circulo é " + area);
            scanner.close();
        }
    }

}
