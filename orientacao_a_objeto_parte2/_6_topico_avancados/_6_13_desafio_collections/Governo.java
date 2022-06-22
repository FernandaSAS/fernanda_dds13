package orientacao_a_objeto_parte2._6_topico_avancados._6_13_desafio_collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {
    // armazena uma lista de políticos por estado da federação
    private final Map<String, List<Politico>> partidosPoliticos;

    public Governo() {
        this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        // recupera a lista de políticos para um partido
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        // se não existir uma lista de políticos para o partido informado,
        // devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }
        // adiciona o político recebido como parâmetro à lista de políticos
        politicos.add(politico);
        // adiciona a lista de políticos ao mapa de partidos usando
        // como chave o nome do partido
        this.partidosPoliticos.put(partidoPolitico, politicos);
    }

    public BigDecimal calcularGastosComSalario(String partidoPolitico) {
        BigDecimal totalGastos = BigDecimal.ZERO;
        List<Politico> politicos = partidosPoliticos.get(partidoPolitico);

        if (politicos != null) {
            for (Politico politico : politicos) {
                totalGastos = totalGastos.add(politico.getCargo().getSalario());
            }
            // implementar busca de políticos para o partido informado
            // e cálculo dos salários
        }
        return totalGastos;
    }

    public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
        BigDecimal totalGastosParaCargo = BigDecimal.ZERO;
        List<Politico> politicos = partidosPoliticos.get(partidoPolitico);

        if (politicos != null) {
            for (Politico politico : politicos) {
                if (politico.getCargo().equals(cargo)) {
                    totalGastosParaCargo = totalGastosParaCargo.add(politico.getCargo().getSalario());
                }
            }
        }
        // implementar busca dos políticos para o partido e cargo informados
        // e cálculo dos salários
        return totalGastosParaCargo;
    }
}

