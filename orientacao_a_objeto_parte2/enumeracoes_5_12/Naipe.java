package orientacao_a_objeto_parte2.enumeracoes_5_12;

import java.util.concurrent.CopyOnWriteArraySet;

public enum Naipe {
    OURO("VERMELHO"),
    PAUS("PRETO"),
    ESPADA("PRETO"),
    COPAS("VERMELHO");

    private String cor;
    Naipe(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;

    }
}
