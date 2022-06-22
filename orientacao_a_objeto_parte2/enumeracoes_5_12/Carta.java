package orientacao_a_objeto_parte2.enumeracoes_5_12;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta() {
        System.out.println("Sou " + numero + " de " + ", E tenho a cor " + naipe.getCor());
    }
}
