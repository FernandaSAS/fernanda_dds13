package orientacao_a_objeto_parte2._5_24_exercicio_interface_e_polimorfismo;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretora = new CorretoraSeguros();
        Carro meuCarro = new Carro(45000d, 2012);
        Imovel minhaCasa = new Imovel(920000, 320);
        corretora.fazerPropostaSeguro(meuCarro);
        corretora.fazerPropostaSeguro(minhaCasa);
    }

}

