package orientacao_a_objeto_parte2.modificadores_static_e_final;

import java.sql.SQLOutput;

public class Contador {// ESTA CLASSE TEM DUAS PRORPIEDADES
    public static int COUNT = 0;
    public static final double PI = 3.14;
    public void incrementar() {
        COUNT++;
    }
    public static void imprimirContador() {
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }
}