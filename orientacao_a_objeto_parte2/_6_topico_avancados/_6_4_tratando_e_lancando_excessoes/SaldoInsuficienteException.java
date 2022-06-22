package orientacao_a_objeto_parte2._6_topico_avancados._6_4_tratando_e_lancando_excessoes;

public class SaldoInsuficienteException extends Throwable {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}