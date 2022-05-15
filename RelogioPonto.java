package RelgPontoPkg;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class RelogioPonto {
    private LocalDate dataRegistro = LocalDate.of(2022, 06, 02);
    private LocalTime horaSaida = LocalTime.of(19,00);
    private LocalTime horaEntrada = LocalTime.of(10,00);

    Date date = new Date();

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void imprimirHora(){
        System.out.println("Data de Registro: " + dataRegistro);
        System.out.println("Hora de Entrada: " + horaEntrada);
        System.out.println("Data de Saída: " + horaSaida);

        System.out.println(date);
    }


}
