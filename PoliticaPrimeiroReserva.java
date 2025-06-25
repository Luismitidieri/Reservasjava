public class PoliticaPrimeiroReserva implements PoliticaReserva{
    public boolean podeReservar(User novoUsuario, Reserva reservaExistente){
        return false;// Não permite mudar reservas existentes
    }
}