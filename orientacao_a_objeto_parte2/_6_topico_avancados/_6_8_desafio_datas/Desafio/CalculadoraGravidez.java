package orientacao_a_objeto_parte2._6_topico_avancados._6_8_desafio_datas.Desafio;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

    private final Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar dataEstimadaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        dataEstimadaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
        return dataEstimadaConcepcao.getTime();

        //  implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
    }

    public Date calcularDataEstimadaParto() {
        Calendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);
        return dataEstimadaParto.getTime();
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
    }
}


