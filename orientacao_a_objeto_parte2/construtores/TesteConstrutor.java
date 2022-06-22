package orientacao_a_objeto_parte2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        System.out.println("Nome: \"" + p1.nome +"," + p1.idade + "\"");
        Pessoa p2 = new Pessoa("Fernanda", 46);
        System.out.println("Nome: \"" + p2.nome + "," + p2.idade + "\"");
        Pessoa p3 = new Pessoa("Karol", 27, "feminino");
        System.out.println("Nome: \"" + p3.nome + "," + p3.idade + "\"" +","+ p3.sexo+ "\"");
        Pessoa p4 = new Pessoa("Julianderson","Nascimnto", 21, "masculino");
        System.out.println("Nome: \"" +p4.nome + " " + p4.sobrenome+","+p4.idade+","+p4.sexo);
    }
}
