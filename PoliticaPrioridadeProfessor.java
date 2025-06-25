public class PoliticaPrioridadeProfessor implements PoliticaReserva{
    public boolean podeReservar( User novoUsuario, Reserva reservaExistente){
        if( novoUsuario.getTipo().equals("PROFESSOR") && reservaExistente.getUser().getTipo().equals("ALUNO")){
            return true;//Professor tem prioridade
        }
        return false;
     }
    
}