package orientacao_a_objeto_parte2.sobreposicao_5_16;

public class ProdutoPerecivel extends Produto{
    protected String dataValidade;
    public void identificar(){
        System.out.println("Minha data de Validde é " + dataValidade);
    }
}

