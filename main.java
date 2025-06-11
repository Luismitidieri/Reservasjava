import java.time.LocalDateTime;

public class main{
    public static void main (String[] args){
        SistemaReserva sistema = new SistemaReserva();

        User Luis = new User("Luis");
        Sala sala1 = salaFactory.criarSala("Grupo", "Sala 101");
        Sala sala2 = salaFactory.criarSala ( "Individual", "Sala 102");

        LocalDateTime horario1 = LocalDateTime.of(2025,6,15,10,0);
        LocalDateTime horario2 = LocalDateTime.of(2025,15,14,10,0);

        sistema.FazerReserva(Luis, sala1, horario1);
        sistema.FazerReserva(Luis, sala2, horario2);

        System.out.println("Reservas concluídas");
        sistema.ListarReservas();



    }
}