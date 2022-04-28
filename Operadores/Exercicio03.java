package Operadores;

import java.util.Scanner;

/*Faça um programa que receba:  O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado
... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor gasto com Agua: R$");
        double gastoAgua = scanner.nextDouble();
        System.out.print("Digite o valor gasto com telefone: R$");
        double gastoTelefone = scanner.nextDouble();
        System.out.print("Digite o valor gasto com Escola do filho: R$");
        double escolaFilho = scanner.nextDouble();
        System.out.print("Digite o valor gasto com cartão de credito: R$");
        double cartaoCredito = scanner.nextDouble();
        System.out.print("Digite o valor gasto com supermercado: R$");
        double gastoSupermercado = scanner.nextDouble();
        double gastoMensal = 0;
        gastoMensal += gastoAgua;
        gastoMensal += gastoSupermercado;
        gastoMensal += gastoTelefone;
        gastoMensal += escolaFilho;
        gastoMensal += cartaoCredito;
        gastoMensal += gastoSupermercado;
        System.out.println("O gasto mensal é " + gastoMensal);
        scanner.close();
    }

}

