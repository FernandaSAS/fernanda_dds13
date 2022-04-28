package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {
   /* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite sua altura: ");
        Double h = scanner.nextDouble();
        Double pesoHomem = (72.7*h) - 58;
        Double pesoMulher = (62.1*h) - 44.7;
        System.out.println("Se você é do Sexo masculino, o seu peso ideal é: " +pesoHomem);
        System.out.println("Se você é do sexo Feminiso, seu peso ideal é: " + pesoMulher);
        scanner.close();


        
    }
}
