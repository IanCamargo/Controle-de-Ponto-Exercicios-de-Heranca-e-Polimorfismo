import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciarControlePonto {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try {
            Gerente gerente = new Gerente();
            gerente.setIdFunc(1);
            gerente.setNome("Ian Camargo");
            gerente.setEmail("ian.camargo@fatec.sp.gov.br");
            gerente.setLogin("ianC");
            gerente.setSenha("senhaIan");

            Secretaria secretaria = new Secretaria();
            secretaria.setIdFunc(2);
            secretaria.setNome("Dry Caleffi");
            secretaria.setEmail("dry.caleffi@fatec.sp.gov.br");
            secretaria.setTelefone("(11) 12345-6789");
            secretaria.setRamal("001");

            Operador operador = new Operador();
            operador.setIdFunc(3);
            operador.setNome("Fernando Divino");
            operador.setEmail("fernando.divino@fatec.sp.gov.br");
            operador.setValorHora(30.0);

            RegistroPonto rpGerenteEntrada = new RegistroPonto();
            rpGerenteEntrada.setIdRegPonto(1);
            rpGerenteEntrada.setFunc(gerente);
            rpGerenteEntrada.setDataRegistro(LocalDate.now());
            rpGerenteEntrada.setHoraEntrada(LocalDateTime.now());
            System.out.println("==================================");
            System.out.println("Funcionário: " + gerente.getNome());
            System.out.println("Data de Registro: " + rpGerenteEntrada.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpGerenteEntrada.getHoraEntrada().format(timeFormatter));
            System.out.println("==================================");
            Thread.sleep(1000);

            RegistroPonto rpOperadorEntrada = new RegistroPonto();
            rpOperadorEntrada.setIdRegPonto(2);
            rpOperadorEntrada.setFunc(operador);
            rpOperadorEntrada.setDataRegistro(LocalDate.now());
            rpOperadorEntrada.setHoraEntrada(LocalDateTime.now());
            System.out.println("Funcionário: " + operador.getNome());
            System.out.println("Data de Registro: " + rpOperadorEntrada.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpOperadorEntrada.getHoraEntrada().format(timeFormatter));
            System.out.println("==================================");
            Thread.sleep(1000);

            RegistroPonto rpSecretariaEntrada = new RegistroPonto();
            rpSecretariaEntrada.setIdRegPonto(3);
            rpSecretariaEntrada.setFunc(secretaria);
            rpSecretariaEntrada.setDataRegistro(LocalDate.now());
            rpSecretariaEntrada.setHoraEntrada(LocalDateTime.now());
            System.out.println("Funcionário: " + secretaria.getNome());
            System.out.println("Data de Registro: " + rpSecretariaEntrada.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpSecretariaEntrada.getHoraEntrada().format(timeFormatter));
            System.out.println("==================================");
            Thread.sleep(1000);

            RegistroPonto rpGerenteSaida = new RegistroPonto();
            rpGerenteSaida.setIdRegPonto(4);
            rpGerenteSaida.setFunc(gerente);
            rpGerenteSaida.setDataRegistro(LocalDate.now());
            rpGerenteSaida.setHoraEntrada(rpGerenteEntrada.getHoraEntrada());
            rpGerenteSaida.setHoraSaida(LocalDateTime.now());
            System.out.println("Funcionário: " + gerente.getNome());
            System.out.println("Data de Registro: " + rpGerenteSaida.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpGerenteSaida.getHoraEntrada().format(timeFormatter));
            System.out.println("Hora de Saída: " + rpGerenteSaida.getHoraSaida().format(timeFormatter));
            System.out.println("==================================");
            Thread.sleep(1000);

            RegistroPonto rpOperadorSaida = new RegistroPonto();
            rpOperadorSaida.setIdRegPonto(5);
            rpOperadorSaida.setFunc(operador);
            rpOperadorSaida.setDataRegistro(LocalDate.now());
            rpOperadorSaida.setHoraEntrada(rpOperadorEntrada.getHoraEntrada());
            rpOperadorSaida.setHoraSaida(LocalDateTime.now());
            System.out.println("Funcionário: " + operador.getNome());
            System.out.println("Data de Registro: " + rpOperadorSaida.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpOperadorSaida.getHoraEntrada().format(timeFormatter));
            System.out.println("Hora de Saída: " + rpOperadorSaida.getHoraSaida().format(timeFormatter));
            System.out.println("==================================");
            Thread.sleep(1000);

            RegistroPonto rpSecretariaSaida = new RegistroPonto();
            rpSecretariaSaida.setIdRegPonto(6);
            rpSecretariaSaida.setFunc(secretaria);
            rpSecretariaSaida.setDataRegistro(LocalDate.now());
            rpSecretariaSaida.setHoraEntrada(rpSecretariaEntrada.getHoraEntrada());
            rpSecretariaSaida.setHoraSaida(LocalDateTime.now());
            System.out.println("Funcionário: " + secretaria.getNome());
            System.out.println("Data de Registro: " + rpSecretariaSaida.getDataRegistro().format(dateFormatter));
            System.out.println("Hora de Entrada: " + rpSecretariaSaida.getHoraEntrada().format(timeFormatter));
            System.out.println("Hora de Saída: " + rpSecretariaSaida.getHoraSaida().format(timeFormatter));
            System.out.println("==================================");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}