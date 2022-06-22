package orientacao_a_objeto_parte2._6_topico_avancados._6_3_desafio_classe_java_lang_math;
import java.util.Random;
import java.util.Scanner;

public class teste {

    public static class Random1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random gerador = new Random();
            int quantidadesDeJogadas;
            System.out.print("Quantos Jogos para MegaSena deseja fazer?");
            quantidadesDeJogadas = scanner.nextInt();
            for (int i = 0; i < quantidadesDeJogadas; i++) {
                System.out.println("Rodada" +(i+1));
                for (int n = 0; n<6; n++){
                    double numeroAleatorio = Math.round(Math.random() * 60);
                    System.out.println(gerador.nextInt(60)+" ");

                }
            }

        }
    }
}
