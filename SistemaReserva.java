import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class SistemaReserva{
    private List <Reserva> reservas = new ArrayList<>();
    private PoliticaReserva politica;
    private List<Observer> observadores = new ArrayList<>();


    public SistemaReserva(PoliticaReserva politica){
        this.politica = politica;
    }

    public void AdicionarObservador(Observer o){
        observadores.add(o);
    }
    
    public void RemoverObservador (Observer o){
        observadores.remove(o);
    }

    private void NotificarObservadores(String mensagem){
        for(Observer o : observadores){
            o.atualizar(mensagem);
        }
    }

    public void FazerReserva(User user, Sala sala, LocalDateTime dataHora) {
        if(dataHora.isBefore(LocalDateTime.now())){
            System.out.println("Erro:Não é possível reservar no passado");
            return;
        }

        Reserva reservaExistente = encontrarReserva(sala, dataHora);

        if(reservaExistente != null){
            if(!politica.podeReservar(user, reservaExistente)){
                System.out.println("Erro: A reserva anterior tem prioridade.");
                return;
            }else{
                reservas.remove(reservaExistente);
                NotificarObservadores("Reserva de " + reservaExistente.getUser().getNome() + " foi substituida por " + user.getNome());
                System.out.println("Reserva anterior removida por conta de prioridade.");
            }
        }
        
        if(encontrarReserva(sala, dataHora) !=null){
            System.out.println("Erro:conflito de horário.");
            return;

        } 
        

        Reserva nova = new Reserva(user, sala, dataHora);
        reservas.add(nova);
        System.out.println("Reserva feita com sucesso!");
        NotificarObservadores("Nova reserva de " + user.getNome() + " na sala " + sala.getNome());
    }

    private Reserva encontrarReserva(Sala sala, LocalDateTime dataHora){
        for(Reserva r : reservas){
            if(r.getSala().getNome().equals(sala.getNome()) && r.getDataHora().equals(dataHora)){
                return r;
            }
        }
        return null;
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
    
    public void gerarRelatorioDiario(LocalDateTime data){
        System.out.println("Relatório de reservas para o dia:" + data.toLocalDate());
        boolean encontrou = false;
        for(Reserva r : reservas){
            if(r.getDataHora().toLocalDate().equals(data.toLocalDate())){
                System.out.println("-" + r.getSala().getNome() + ": " + r);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhuma reserva no dia.");

        }
    }
}
