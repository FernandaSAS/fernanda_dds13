package orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17;

//No Contruyot criar as variaveis
public class ContaPagar  extends Conta {
private Fornecedor fornecedor;


    public ContaPagar() {

    }
    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);

    }
    public void pagar() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar uma conta que ja esta paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar uma conta que está cancelada; "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
        this.getFornecedor().getNome();
    }


}




