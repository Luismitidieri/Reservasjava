public class SalaGrupo extends Sala{
    public SalaGrupo (String nome){
        super(nome);

    }

    @Override
    public String getTipo(){
        return "Estudo em Grupo";
    }
}