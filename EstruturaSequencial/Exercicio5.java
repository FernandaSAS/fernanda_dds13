package EstruturaSequencial;/* Faça um Programa que converta metros para centímetros.*/


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de metros desejada: ");
        double metros = scanner.nextDouble();
        double centimetros = metros*100;
        System.out.println("A quantidade de metros convertida em centimetros é: " +centimetros);
        scanner.close();
    }

}
