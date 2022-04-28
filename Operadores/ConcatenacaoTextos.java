package Operadores;

import com.sun.security.jgss.GSSUtil;

public class ConcatenacaoTextos {
    public static void main(String[] args) {
        String inicio = "Esse é o ";
        String meio = "º exemplo ";
        String fim = "sobre concatenação de texto.";
        Integer numeroExemplo = 2;
        System.out.println(inicio + numeroExemplo+meio+fim);
        //System.out.println("Esse " + meio + "de concatenação de textos.");
    }
}
