package orientacao_a_objeto_parte2._6_topico_avancados._6_12_metodos_equals_e_hashCode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<Aluno> buscarAlunos(){
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Ricardo"));
        alunos.add(new Aluno("Thiago"));
        alunos.add(new Aluno("Maria"));

        return alunos;
    }
}