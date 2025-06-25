public class SalaLaboratorio extends Sala{
    public SalaLaboratorio(String nome){
        super(nome);
    }
    @Override
    public String getTipo(){
        return "Laboratorio";
    }
}