package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            System.out.print("Digite o primeiro numero: ");
            int primeiroNumero = scanner.nextInt();
            System.out.print("Digite o segundo numero: ");
            int segundoNumero = scanner.nextInt();
            System.out.print("Digite o terceiro numero: ");
            int terceiroNumero = scanner.nextInt();
            if (primeiroNumero>segundoNumero && primeiroNumero>terceiroNumero) {
                System.out.println("O Primeiro Numero, " + primeiroNumero + " é o maior!");
            } else
            if (segundoNumero>primeiroNumero && segundoNumero>terceiroNumero) {
                System.out.println("O Segundo Numero, " + segundoNumero + " é o maior!");
            } else
            if (terceiroNumero>primeiroNumero && terceiroNumero>segundoNumero) {
                System.out.println("O Terceiro Numero, " + terceiroNumero + " é o maior!");
            }
            scanner.close();
        }
    }
}

