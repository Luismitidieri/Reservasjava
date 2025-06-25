public class SalaComProjetor extends SalaDecorator{
    public SalaComProjetor (Sala sala) {
        super(sala);
    }

    @Override 
    public String getTipo(){
        return salaDecorada.getTipo() + " + Projetor";
    }
}