package Programacao_Orientada_A_Objetos.Exercicio01;

import javax.swing.*;

/*
Método que informa necessidade de repor estoque
Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado produto em uma
loja qualquer. Considere que a quantidade mínima de um produto deva ser 10. Se o estoque for menor que isso, então ele
retornará *true*, pois, será necessária a reposição do estoque, caso contrário, ele retornará false.
Como parâmetro, esse método deverá receber um tipo que você irá criar e chamar de Produto, ou seja, você vai criar uma
classe chamada Produto com os atributos necessários. Os atributos da classe serão nome e quantidadeEstoque.
Feito isso, implemente o método main do programa. Nele você vai criar uma variável do tipo Produto e depois usar essa
variável para invocar o método que valida a necessidade de reposição de estoque.
No final, você vai exibir, no console, se é necessária a reposição ou não.
 */
public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.codigoProduto = 45;
        produto.descricao = "Nike";
        produto.precoUnitario = 299.90;
        produto.quantidadeEmEstoque = 9;

        exibirQuantidadeEmEstoque(produto);
    }

    static void exibirQuantidadeEmEstoque(Produto produto) {
        JOptionPane.showMessageDialog(null, "A quantidade em estoque do " + produto.descricao + ", Codigo " + produto.codigoProduto + ", custo unitario " + produto.precoUnitario + " é de " + produto.quantidadeEmEstoque + ".");
        if (produto.quantidadeEmEstoque < 10) {
            JOptionPane.showMessageDialog(null, "Estoque abaixo do permitido: " + produto.quantidadeEmEstoque);
            JOptionPane.showMessageDialog(null, "Providenciar reposição de estoque!");
        } else {
            JOptionPane.showMessageDialog(null, "Seu estoque esta abastecido, atentar-se para a quantidade minima = 9.");
        }
    }
}
