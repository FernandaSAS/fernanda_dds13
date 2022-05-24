package orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17;

public class ContaReceber extends Conta {


    public ContaReceber() {

    }

    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void cancelar() {
        if (valor > 50000) {
            System.out.println("Se a Conta for maior que R$50.000 " + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("A conta " + this.getDescricao() + "ja foi cancelada.");
        } else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("A conta " + this.getDescricao() + "ja foi paga.");
        } else {
            System.out.println("Cancelando conta" + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    @Override
    public void receber() {
        if (SituacaoConta.PENDENTE.equals(this.getSituacaoConta())) {
            System.out.println(" Conta " + this.getDescricao() + " paga com sucesso");
        }
    }
}
