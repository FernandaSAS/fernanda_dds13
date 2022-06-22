package orientacao_a_objeto_parte2.heranca_e_modificador_protected_5_14;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("olá, eu sou o " + nome + ", e tenho " + idade + " anos.");
    }
}
