package orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17;

//No Contruyot criar as variaveis
public class ContaPagar  extends Conta {
    public ContaPagar() {

    }
    public ContaPagar(Fornecedor mercado, String descricao, double valor, String dataVencimento) {
        this();
        this.fornecedor = getFornecedor();
        this.descricao = getDescricao();
        this.valor = getValor();
        this.dataVencimento = getDataVencimento();


    }
    void pagar() {
        if (orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que ja esta paga: "
                    + this.getDescricao() + ".");
        } else if (orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada; "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}




