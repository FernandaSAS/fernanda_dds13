package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letraDigitada = scanner.next().charAt(0);
        if (('a' <= letraDigitada && letraDigitada <= 'z') || ('A' <= letraDigitada && letraDigitada <= 'Z')) {
            switch (letraDigitada) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                    System.out.println("A letra Digitada é uma Vogal\n");
                }
                default -> {
                    System.out.println("A letra digitada é uma Consoante\n");
                }
            }
        }
    }
}
