package orientacao_a_objeto_parte2.construtores;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    String sobrenome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, String sexo) {
        this(nome, idade);
        this.sexo = sexo;
    }

    public Pessoa(String nome, String sobrenome, int idade, String sexo) {
        this(nome, idade, sexo);
        this.sobrenome = sobrenome;
    }
}
