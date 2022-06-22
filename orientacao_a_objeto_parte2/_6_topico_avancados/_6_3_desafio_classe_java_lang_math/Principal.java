package orientacao_a_objeto_parte2._6_topico_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    /*
A Mega-Sena é o jogo que paga milhões de reais para o acertador dos números sorteados.
Em um jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60.
Na empresa que você trabalha, o pessoal se juntou para fazer um bolão. Um bolão acontece quando
várias pessoas se unem para jogarem várias combinações de números em conjunto. Se algum jogo for
contemplado, o valor do prêmio é dividido entre todos os participantes.
Como um bom programador, você sugeriu e se dispôs a desenvolver um pequeno software para gerar os números a serem
 marcados nos jogos. Todos concordaram, agora você tem um importante trabalho pela frente.
Faça um programa em Java que recebe como parâmetro do usuário a quantidade de jogos a serem feitos, gera e exibe na tela a sequência de números de cada jogo.
Use a classe Math para gerar números aleatórios e fazer arredondamentos. Lembre-se de verificar se não existem
números repetidos em uma sequência, pois os 6 números devem ser únicos.
Se levar esse desafio a sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)
 */
    public static <function> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int[] vet = new int[0];
        int quantidadeDeNumeros;
        System.out.print("Escolha a quantidade de numeros acima de 6: ");
        quantidadeDeNumeros = scanner.nextInt();
        int quantidadeDeJogadas;
        System.out.print("Quantos Jogos deseja fazer? ");
        quantidadeDeJogadas = scanner.nextInt();
        for (int i = 0; i < quantidadeDeJogadas; i++) {
            System.out.println("Rodada" + (i + 1));
            for (int n = 0; n < quantidadeDeNumeros; n++) {
                double gerar = (Math.random() * 60);
                while (true) {
                    if (Math.round(gerar) != 0) {
                        long numeroaleatorio = Math.round(gerar);
                        System.out.println(numeroaleatorio + ", ");
                        break;
                    }
                }
            }
        }
    }
}

