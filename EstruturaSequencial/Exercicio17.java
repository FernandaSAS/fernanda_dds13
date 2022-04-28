package EstruturaSequencial;/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere
que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que
custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.        Informe ao usuário as quantidades de tinta a serem compradas e
os respectivos preços em 3 situações:
        comprar apenas latas de 18 litros;
        comprar apenas galões de 3,6 litros;
        misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamano da area em metros quadrados: ");
        double tamanhoArea = scanner.nextDouble();
        double capacidadeLataGrande = 18;
        double valorLataGrande = 80.00;
        double capacidadeLataPequena = 3.6;
        double valorLataPequena = 25.00;
        double quantidadeDeTinta = tamanhoArea/3;
        double quantidadeLataGrande = quantidadeDeTinta/capacidadeLataGrande;
        double valoraPagarLataGrande = quantidadeLataGrande * valorLataGrande;
        double quantidadeLataPequena = quantidadeDeTinta/capacidadeLataPequena;
        double valoraPagarLataPequena = quantidadeLataPequena * valorLataPequena;
        System.out.println("A quantidade de tinta a ser usada é: "+quantidadeDeTinta+"L");
        System.out.println("A quantidade de latas grandes de tinta a ser usada é " + quantidadeLataGrande);
        System.out.println("O valor a pagar é R$ " + valoraPagarLataGrande);
        System.out.println("==========================================================================");
        System.out.println("A quantidade de latas pequenas de tinta a ser usada é " + quantidadeLataPequena);
        System.out.println("O valor a pagar é R$ " + valoraPagarLataPequena);
        double economizartinta1 = quantidadeLataGrande + quantidadeLataPequena;


       // Math.ceil(quantidadeLataGrande) / Math.ceil(quantidadeLataPequena) ,  Math.ceil(litros) / Math.ceil(lata) + Math.ceil(galao)



    }
}
