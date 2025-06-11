public class SalaIndividual extends Sala{
    public SalaIndividual(String nome){
        super(nome);
    }
    @Override
    public String getTipo(){
        return "Estudo Individual";
        
    }
}