package Operadores;/*Crie um programa que receba o valor de um produto e exiba o valor final da compra. Esse valor final será o valor do
produto mais o valor do frete - use o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor
final de R$95,00. Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
*/

import java.util.Scanner;

public class ExercicioOperadores02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        double frete = 15.00;
        double valorComFrete = valorProduto + frete;
        boolean produtoPagaFrete = valorProduto < 100;
        boolean produtoNaoPagaFrete = valorProduto >= 100;
        if (produtoPagaFrete) {
            System.out.println("O Produto custa R$ " + valorProduto+"0");
            System.out.println("Neste valor haverá cobança de frete. O valor a pagar é: R$ " + valorComFrete+"0");
        } else if (produtoNaoPagaFrete) {
            System.out.println("O produto custa R$ " + valorProduto+"0");
            System.out.println("Neste valor o frete é gratis. Você pagará: R$ " + valorProduto+"0");
        }
        scanner.close();
    }
}
