package EstruturaSequencial;/*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em
graus Fahrenheit.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a temperatura em Celsios: ");
            double celsios = scanner.nextDouble();
            double fahrenheit= (celsios *1.8)+32;
            System.out.println("A temperatura em fahrenheit é " + fahrenheit);
            scanner.close();
    }

    {

    }

}
