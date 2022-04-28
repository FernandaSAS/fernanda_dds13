package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {
    /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
    Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
    deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
    calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na
    variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade Pescada: ");
        Double peso = scanner.nextDouble();
        double quantidadePermitida = 50;
        double multa = 4.00;
        double excesso = (peso-quantidadePermitida)*multa;
        System.out.println("O peso digitado foi "+peso);
        System.out.println("A multa a ser paga é: " + excesso);



    }
}
