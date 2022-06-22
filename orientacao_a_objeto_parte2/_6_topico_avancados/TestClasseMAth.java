package orientacao_a_objeto_parte2._6_topico_avancados;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TestClasseMAth {
    public static void main(String[] args) {
        //comprimento de uma circunferencia 2 x r x PI(3,1415)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);
        //MAximo e minimo

        double[] precosProdutoA = {30.20, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        //potencia
        System.out.println("2³: " + Math.pow(2,3));

        //raiz quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        //arredondamento ceil, floor e round
        double n=5.4;
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

        //Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        //Numero randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println(numeroAleatorio);

    }

}
