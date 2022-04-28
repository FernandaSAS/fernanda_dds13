package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numeroEscolhido = scanner.nextInt();
        if (numeroEscolhido>0) {
            System.out.println("O Numero escolhido, " + numeroEscolhido + ", é positivo!");
        } else {
            System.out.println("O numero escolhido, " + numeroEscolhido + ", é negativo!");
        }
    }
}
