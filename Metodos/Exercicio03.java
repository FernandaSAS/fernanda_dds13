package Metodos;

import java.util.Scanner;

/*
Crie uma pequena calculadora de subtração e adição.
Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
 Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
 que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        String[] operacao = new String[]{"-", "+"};
    }
}
