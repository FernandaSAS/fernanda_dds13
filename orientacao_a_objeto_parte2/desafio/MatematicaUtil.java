package orientacao_a_objeto_parte2.desafio;

public class MatematicaUtil {
        public static final double PI = 3.14;
        public static int calcularFibonacci(int posicao) {
            if (posicao < 2) {
                return posicao;
            }
            return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
        }

        public static double calcularAreaCirculo(double raio) {
            double area = raio*raio*MatematicaUtil.PI;
            return area;
    }
}
