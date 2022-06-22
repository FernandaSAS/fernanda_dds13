package orientacao_a_objeto_parte2._6_topico_avancados.Desafio;

import orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor;
import orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.SituacaoConta;

public class ContaPagar extends Conta{
    private orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor fornecedor;


    public ContaPagar() {

    }
    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);

    }
    void pagar(orientacao_a_objeto_parte2._6_topico_avancados.Desafio.SituacaoConta paga) {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new IllegalArgumentException("Não pode pagar uma conta que ja esta paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new IllegalArgumentException("Não pode pagar uma conta que está cancelada; "
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


