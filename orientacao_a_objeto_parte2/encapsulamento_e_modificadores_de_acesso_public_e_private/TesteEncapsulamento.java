package orientacao_a_objeto_parte2.encapsulamento_e_modificadores_de_acesso_public_e_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("temperatura do ar " + ar.obterTemperatura());
        ArCondicionado ar2 = new ArCondicionado();
        ar2.trocarTemperatura(22);
        System.out.println("temperatura do 2º ar " + ar2.obterTemperatura());

    }
}
