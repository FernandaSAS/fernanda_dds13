package orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17;

public class ContaReceber extends Conta {


    private Cliente cliente;

    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() {
        if (this.getValor() > 50000) {
            System.out.println("A conta "+ this.getDescricao()+" não pode ser cancelada. É muito dinheiro para deixar de receber. " );
        } else {
            super.cancelar();
        }
    }
    @Override
    public void receber() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("nÃO PODE RECEBER UMA CONTA QUE JA ESTA PAGA"
                    + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals((this.situacaoConta))){
            throw new OperacaoContaException("NÃO PODE RECEBER UMA CONTA QUE ESTA CANCELADA: " + this.getDescricao());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de" + this.getValor() + " e vencimento em "
                    + this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
