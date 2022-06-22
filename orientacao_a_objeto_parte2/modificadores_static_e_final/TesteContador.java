package orientacao_a_objeto_parte2.modificadores_static_e_final;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        System.out.println(Contador.COUNT);
        Contador.imprimirContador();

    }
}
