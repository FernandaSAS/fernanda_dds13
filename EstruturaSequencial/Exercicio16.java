package EstruturaSequencial;

import java.util.Scanner;

/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamano da area em metros quadrados: ");
        double tamanhoArea = scanner.nextDouble();
        double capacidadeLata = 18;
        double valorLata = 80.00;
        double quantidadeDeTinta = tamanhoArea/3;
        double quantidadeLatas = quantidadeDeTinta/capacidadeLata;
        double valoraPagar = quantidadeLatas * valorLata;
        System.out.println("A quantidade de tinta a ser usada é: "+quantidadeDeTinta+"L");
        System.out.println("A quantidade de latas de tinta a ser usada é " + quantidadeLatas);
        System.out.println("O valor a pagar é R$ " + valoraPagar);
        scanner.close();
    }
}
