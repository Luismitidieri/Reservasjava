import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class SistemaReserva{
    private List <Reserva> reservas = new ArrayList<>();

    public void FazerReserva(User user, Sala sala, LocalDateTime dataHora) {
        if(dataHora.isBefore(LocalDateTime.now())){
            System.out.println("Erro:Não é possível reservar no passado");
            return;
        }

        Reserva nova = new Reserva(user, sala, dataHora);
        reservas.add(nova);
        System.out.println("Reserva feita com sucesso!");
    }
    public void ListarReservas(){
        if (reservas.isEmpty()){
            System.out.println("Nenhuma reserva no sistema");
        } else {
        for( Reserva r: reservas){
            System.out.println(r);

            }
        }
    }   
}

