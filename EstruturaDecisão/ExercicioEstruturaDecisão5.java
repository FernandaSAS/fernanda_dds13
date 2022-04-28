package EstruturaDecisão;/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

import java.util.Scanner;

public class ExercicioEstruturaDecisão5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira Nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda Nota: ");
        double segundaNota = scanner.nextDouble();
        double mediaAlcancada = (primeiraNota + segundaNota) / 2;
        if (mediaAlcancada == 10) {
            System.out.println("Sua Média é " + mediaAlcancada);
            System.out.println("Aprovado com Distinção!");
        } else if (mediaAlcancada >= 7) {
            System.out.println("Sua Média é " + mediaAlcancada);
            System.out.println("Aprovado!");
        } else if (mediaAlcancada < 7 && mediaAlcancada < 10) {
            System.out.println("Sua Média é " + mediaAlcancada);
            System.out.println("Reprovado!");
        }
        scanner.close();
     }
}
