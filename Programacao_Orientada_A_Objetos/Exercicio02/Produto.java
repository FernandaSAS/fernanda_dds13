package Programacao_Orientada_A_Objetos.Exercicio02;

public class Produto {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa não é uma variável e sim, uma constante.
    String nome;
    Integer quantidadeEstoque;

    static Boolean eNecessarioReporEstoque(Produto produto) {
        return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}