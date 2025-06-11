public class Laboratorio extends Sala{
    public Laboratorio(String nome){
        super(nome);
    }
    @Overridepublic String getTipo(){
        return "Laboratorio";
    }
}