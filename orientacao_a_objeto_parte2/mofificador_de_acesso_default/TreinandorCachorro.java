package orientacao_a_objeto_parte2.mofificador_de_acesso_default;

public class TreinandorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("BOB");
        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);

    }
}
