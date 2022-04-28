package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double primeiroNum = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double segundoNum = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double terceironum = scanner.nextDouble();
        boolean numeroMenor = primeiroNum<segundoNum && primeiroNum<terceironum;
        boolean numeroDoMeio = segundoNum>primeiroNum && segundoNum<terceironum;
        boolean numeroMaior = terceironum>primeiroNum && terceironum>segundoNum;
        if (numeroMaior)

        if(numeroDoMeio)

        if (numeroMenor)
        {
            System.out.println(" " + numeroMaior+ " " + numeroDoMeio+ " " +numeroMenor);
        }

    }
}
