package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro preço: R$ ");
        double primeiroPreco = scanner.nextDouble();
        System.out.print("Digite o sgundo preço: R$ ");
        double segundoPreco = scanner.nextDouble();
        System.out.print("Digite o terceiro preço: R$ ");
        double terceiroPreco = scanner.nextDouble();
        if (primeiroPreco < segundoPreco && primeiroPreco < terceiroPreco) {
            System.out.println("O Primeiro preço, R$ " + primeiroPreco + ", é o menor, !");
        } else if (segundoPreco < terceiroPreco && segundoPreco < primeiroPreco) {
            System.out.println("O Segundo preço, R$ " + segundoPreco + ", é o menor!");
        } else if (terceiroPreco < primeiroPreco && terceiroPreco < segundoPreco) {
            System.out.println("O Segundo preço, R$ " + segundoPreco + ", é o menor!");
        }
        scanner.close();
    }
}
