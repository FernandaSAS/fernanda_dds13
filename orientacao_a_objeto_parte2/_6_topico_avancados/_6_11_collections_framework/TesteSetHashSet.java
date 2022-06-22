package orientacao_a_objeto_parte2._6_topico_avancados._6_11_collections_framework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSetHashSet {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");

        Set<Aluno> alunos = new HashSet<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }

    private static void imprimirAlunos(Set<Aluno> alunos) {
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
