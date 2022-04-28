package Estrutura_de_decisao;

import java.util.Scanner;
/*
Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada
Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial
do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).
Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
No final, mostre de quanto será o prêmio desse funcionário(a).
 */

public class Exercicio02 {

    static final Integer MEDIA_SALARIAL_FUNCIONARIO = 2500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a meta de faturamento anual da empresa para o ano que passou: ");
        double metaFaturamentoAnual = scanner.nextDouble();
        System.out.print("Informe o faturamento real da empresa no ultimo ano: ");
        double faturamentoRealdaEmpresa = scanner.nextDouble();
        double oitentaPorCentodaMeta = (metaFaturamentoAnual * 80)/100;
        double oitentaPorCentoDaMediaSalarial = MEDIA_SALARIAL_FUNCIONARIO * 0.80;
        boolean faturamentoRealIgualouMaiorqueaMeta = faturamentoRealdaEmpresa >= metaFaturamentoAnual;
        boolean faturamentoIgualaoitentaPorCentoMeta = faturamentoRealdaEmpresa >= oitentaPorCentodaMeta;
        if (faturamentoRealIgualouMaiorqueaMeta) {
            System.out.println("Parabéns, o faturamento da empresa foi maior ou igual a meta estabelecida, então você recebera uma bonificação de R$" + MEDIA_SALARIAL_FUNCIONARIO+ ",00");
        }else if (faturamentoIgualaoitentaPorCentoMeta) {
            System.out.println("Parabéns, o faturamento da empresa foi igual a 80% da meta estabelecida, então você receberá uma bonificação de R$" + oitentaPorCentoDaMediaSalarial+ "0");
        } else {
            System.out.println("Infelizmente o faturamento anual da empresa não atingiu a meta estabelecida, você nã receberá bonificação.");
        }
        scanner.close();
    }
}
