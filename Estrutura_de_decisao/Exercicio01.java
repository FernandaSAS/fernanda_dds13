package Estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio01 {
    static final Integer MEDIA_TOTAL = 150;
    static final Integer MEDIA_MINIMA = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a nota de matematica: ");
        double notaMatematica = scanner.nextDouble();
        System.out.print("Entre com a nota de Portugues: ");
        double notaPortugues = scanner.nextDouble();
        double notaTotal = notaPortugues + notaMatematica;
        boolean asNotasSaoMAioresqueMediaMinima = ((notaPortugues >= MEDIA_MINIMA) && (notaMatematica >= MEDIA_MINIMA));
        boolean aNotaGeraleMaioIgualaMediaTotal = notaTotal >= MEDIA_TOTAL;
        if (asNotasSaoMAioresqueMediaMinima && aNotaGeraleMaioIgualaMediaTotal) {
            System.out.println("Você passou, conseguiu a vaga!");
        } else {
            System.out.println("Infelizmente você não atingiu a media para passar, você não conseguiu a vaga!");
        }
    }
}
