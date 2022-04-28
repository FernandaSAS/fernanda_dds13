package Operadores;
/*
Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
depois verifique se ela pode aposentar ou não.
Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */
import java.util.Scanner;
public class Eercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeMinimaAposentadoria = 55;
        int tempMinimoContribuicao = 25;
        System.out.print("Digite a sua idade: ");
        int idadeAtual = scanner.nextInt();
        System.out.print("Digite seu tempo de contribuição: ");
        double tempoCntribuicao = scanner.nextFloat();
        boolean idadePodeAposentar = idadeAtual >= idadeMinimaAposentadoria;
        boolean tempoContribuicaoCorreto = tempoCntribuicao >= tempMinimoContribuicao;
        boolean podeAposentar = idadePodeAposentar && tempoContribuicaoCorreto;
        if (podeAposentar) {
            System.out.println("Você tem a idade e o tempo de contribuição minimos para se aproseentar! Parabéns!");
        } else {
            System.out.println("Infelizmente você ainda não atingiu tempo e idade minima para aposentar!");
            scanner.close();
        }
    }
}
