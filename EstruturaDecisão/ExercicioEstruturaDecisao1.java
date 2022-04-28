package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro Numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo Numero: ");
        double segundoNumero = scanner.nextDouble();
        if (primeiroNumero>segundoNumero) {
            System.out.println("O primeiro numero digitado, " +primeiroNumero+ ", é maior que o segundo numero! " );
        }
        else {
            System.out.println("O segundo numero digitado, " +segundoNumero+ ", é maior que o primeiro numero! ");
            scanner.close();
        }
    }

}
