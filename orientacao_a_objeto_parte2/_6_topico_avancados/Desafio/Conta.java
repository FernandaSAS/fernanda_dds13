package orientacao_a_objeto_parte2._6_topico_avancados.Desafio;

import orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Cliente;
import orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor;
import orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.SituacaoConta;

public class Conta {
    String descricao;
    Double valor;
    String dataVencimento;
    orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor fornecedor;
    SituacaoConta situacaoConta;
    private orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Cliente atacadista;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }
    public Conta(String descricao, Double valor, String dataVencimento, orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor fornecedor) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }
    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public orientacao_a_objeto_parte2.desafio_heranca_e_sobreposicao_5_17.Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
    public void setCliente(Cliente atacadista) {
        this.atacadista = atacadista;
    }

    public void receber() {

    }
}

