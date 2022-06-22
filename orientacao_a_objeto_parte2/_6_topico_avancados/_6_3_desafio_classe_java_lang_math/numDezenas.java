package orientacao_a_objeto_parte2._6_topico_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Random;
import java.util.Scanner;

public class numDezenas {
    public static <function> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int[] numerosSorteados = new int[0];
        int quantidadeDeNumeros;
        System.out.print("Escolha a quantidade de numeros acima de 6: ");
        quantidadeDeNumeros = scanner.nextInt();
        int quantidadeDeJogadas;
        System.out.print("Quantos Jogos deseja fazer? ");
        quantidadeDeJogadas = scanner.nextInt();
        for (int i = 0; i < quantidadeDeJogadas; i++) {
            System.out.println("Rodada" + (i + 1));
            System.out.println();
            for (int n = 1; n < quantidadeDeNumeros; n++) {
                double numeroAleatorio = Math.round(Math.random() * 60);
                System.out.print(gerador.nextInt(60) + ", ");


            }
        }
    }
}



