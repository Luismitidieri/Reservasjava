import java.time.LocalDateTime;

public class Reserva{
    private User user;
    private Sala sala;
    private LocalDateTime dataHora;

    public Reserva(User user, Sala sala, LocalDateTime dataHora){
        this.user = user;
        this.sala = sala;
        this.dataHora = dataHora;
    }
    public User getUser(){
        return user;
    }
    public Sala getSala(){
        return sala;
    }
    public LocalDateTime getdataHora(){
        return dataHora;
    }

    @Override
    public String toString(){
        return "reserva de:"+ user.getNome() +"na" + Sala.getNome() + "(" sala.getTipo() + ") em" + dataHora;
    }

}