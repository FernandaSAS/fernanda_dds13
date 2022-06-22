package orientacao_a_objeto_parte2.sobreposicao_5_16;

import java.util.Date;
import java.util.Scanner;

public class TesteSobreposicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a data de VAlidade:");
        String dataDeValidade = scanner.next();
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Carne";
        pp.dataValidade = dataDeValidade;
        pp.identificar();
    }

}
