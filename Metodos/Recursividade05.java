package Metodos;

public class Recursividade05 {
    public static void main(String[] args) {
        Integer texto = 1;
        imprimirTexto(texto);
    }

    static void imprimirTexto(Integer texto) {
        System.out.println("______________________________________");
        System.out.println("Eu Amo muito o JAVA!!!!!!");
        if (++texto <= 10) {
            imprimirTexto(texto);
        }
    }
}
