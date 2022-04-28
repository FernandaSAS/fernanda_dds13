package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        System.out.println("O número informado é: " + numero);
        scanner.close();
    }
}