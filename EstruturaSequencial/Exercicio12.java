package EstruturaSequencial;

import java.util.Scanner;
/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58*/

public class Exercicio12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        Double peso = (72.7*altura) - 58;
        System.out.println("Seu peso ideal é: " + peso);
        scanner.close();
    }

}
