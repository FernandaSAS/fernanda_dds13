package orientacao_a_objeto_parte2._6_topico_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Random;

public class teste1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[6];
        for (int i = 0; i < vet.length; i++) {
            int num = random.nextInt(6);//gera numero aleatorio
            for (int j = 0; j < vet.length; j++) {
                while (num == vet[j])//enquanto numero for = a qualquer posição do vetor
                {
                    num = random.nextInt(6);//gera outro
                }
            }
            System.out.println(vet);
        }
    }//fecha void
} //fecha classe