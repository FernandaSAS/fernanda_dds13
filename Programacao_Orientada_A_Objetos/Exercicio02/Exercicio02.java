package Programacao_Orientada_A_Objetos.Exercicio02;

import static Programacao_Orientada_A_Objetos.Exercicio02.Produto.eNecessarioReporEstoque;

public class Exercicio02 {
    /*
Refatore este código alterando o método estático para um método de instância.
 */

    public static void main(String[] args) {
        Programacao_Orientada_A_Objetos.Exercicio02.Produto produto = new Programacao_Orientada_A_Objetos.Exercicio02.Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;
        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
    }
}