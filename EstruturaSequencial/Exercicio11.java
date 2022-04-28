package EstruturaSequencial;/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        o produto do dobro do primeiro com metade do segundo .
        a soma do triplo do primeiro com o terceiro.
        o terceiro elevado ao cubo.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o 2º numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite o 3º numero: ");
        double terceiroNumero = scanner.nextDouble();
        double total1 = (primeiroNumero * 2) * (segundoNumero / 2);
        double total2 = (primeiroNumero * 3) + terceiroNumero;
        double total3 = terceiroNumero * terceiroNumero * terceiroNumero;
        System.out.println("O produto do dobro do Primeiro Numero + a metade do segundo é: " +total1);
        System.out.println("A soma do triplo do primeiro numero com o terceiro numero é: " +total2);
        System.out.println("O terceiro elevado ao cubo é: " +total3);
        scanner.close();
    }
}
