package orientacao_a_objeto_parte2.enumeracoes_5_12;

public class TesteEnum {
    public static void main(String[] args) {
        Carta quatroPaus = new Carta(4,Naipe.PAUS);
        quatroPaus.imprimirCarta();

        Carta cincoOuro = new Carta(5, Naipe.OURO);
        cincoOuro.imprimirCarta();

        Carta dezCopas = new Carta(10, Naipe.COPAS);
        dezCopas.imprimirCarta();

        Carta noveespada = new Carta(9, Naipe.ESPADA);
        noveespada.imprimirCarta();


    }
}
