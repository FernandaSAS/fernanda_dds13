package EstruturaDecisão;

import java.util.Scanner;

public class ExercicioEstruturaDecisão3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sexo, F para Feminino ou M para Masculino: ");
        char genero = scanner.next().charAt(0);
        if (genero == 'F' || genero == 'f') {
            System.out.println("O genero digitado é Feminino!");
        } else if (genero == 'M'|| genero == 'm'){
            System.out.println("O Genero digitado é Masculino!");
        } else {
            System.out.println("O Genero é Invalido");
        }
    }
}
