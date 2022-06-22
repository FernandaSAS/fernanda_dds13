package orientacao_a_objeto_parte2.mofificador_de_acesso_default;

public class Cachorro {
    private String nome;

    public String getNome() {
        return nome;
   }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void sentar(){
        System.out.println("Eu sou o " + nome + " e vou sentar!");
    }
}
