package orientacao_a_objeto_parte2._6_topico_avancados._6_4_tratando_e_lancando_excessoes;

public class TesteExcessoes {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.depositar(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
        }
    }
}
