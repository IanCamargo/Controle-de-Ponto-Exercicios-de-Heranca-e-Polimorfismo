import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private int idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public String apresentarRegistroPonto() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Registro de Ponto ===\n");
        sb.append("ID do Registro: ").append(this.getIdRegPonto()).append("\n");

        if (this.getFunc() != null) {
            sb.append("Funcionário: ").append(this.getFunc().getNome()).append("\n");
        } else {
            sb.append("Funcionário: [Não definido]\n");
        }

        sb.append("Data do Registro: ").append(this.getDataRegistro()).append("\n");
        sb.append("Hora de Entrada: ").append(this.getHoraEntrada()).append("\n");
        sb.append("Hora de Saída: ").append(this.getHoraSaida()).append("\n");

        return sb.toString();
    }

    public RegistroPonto() {
    }

    public RegistroPonto(int idRegPonto, Funcionario func, LocalDate dataRegistro,
                         LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        this.idRegPonto = idRegPonto;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public int getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(int idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}