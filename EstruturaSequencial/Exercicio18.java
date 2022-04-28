package EstruturaSequencial;/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
 calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/


import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo: ");
        double tamanhoArquivo = scanner.nextDouble();
        System.out.print("Digite a velocidade do Link: ");
        double velocidadeLink = scanner.nextDouble();
        double tempoDownload = tamanhoArquivo/(velocidadeLink/8)/60;
        System.out.println("O tempo necessario para Download do arquivo é: " + tempoDownload+ " minutos");
        scanner.close();
    }
}
