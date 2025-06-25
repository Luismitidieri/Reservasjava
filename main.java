import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        PoliticaReserva politica = new PoliticaPrioridadeProfessor();//ou new Politica primeiro reserva
        SistemaReserva sistema = new SistemaReserva(politica); 


        User aluno = new User("Luis","ALUNO");
        User professor = new User("Fabio", "PROFESSOR");

        sistema.AdicionarObservador(aluno);
        sistema.AdicionarObservador(professor);

        Sala salaBase = SalaFactory.criarSala("Grupo", "Sala 101");
        Sala salaComProjetor = new SalaComProjetor (salaBase);

        LocalDateTime horario = LocalDateTime.of(2025,6,20,14,0);
        

        sistema.FazerReserva(aluno, salaComProjetor, horario);
        sistema.FazerReserva(professor, salaComProjetor, horario);

        sistema.ListarReservas();

        System.out.println("\n---Relatório diário---");
        sistema.gerarRelatorioDiario(LocalDateTime.of(2025,6,20,0,0));

    }
}