package orientacao_a_objeto_parte2._6_topico_avancados._6_13_desafio_collections;

import java.math.BigDecimal;

public class Cargo {
    private String descricao;
    private BigDecimal salario;
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getSalario() {
        return this.salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}

