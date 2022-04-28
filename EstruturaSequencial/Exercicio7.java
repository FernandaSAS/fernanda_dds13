package EstruturaSequencial;/*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de um lado do Quadrado: ");
            Double lado = scanner.nextDouble();
            double area = lado*lado;
            double dobroDaArea = area*2;
            System.out.println("A area do Quadrado é: " +area);
            System.out.println("o dobro da area do Quadrado é: " +dobroDaArea);
            scanner.close();
        }
    }
}
