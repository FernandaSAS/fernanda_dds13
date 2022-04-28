package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE DOIS NÚMEROS");
        System.out.print("Digite o 1º número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite o 2º número: ");
        Double numero2 = scanner.nextDouble();

        double total = numero1 + numero2;
        System.out.print("A soma dos números é: " + total);
        scanner.close();
    }
}