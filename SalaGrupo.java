public class SalaGrupo extends Sala{
    public SalaGrupo (String nome){
        super(nome);

    }

    @Overridepublic String gettipo(){
        return "Estudo em Grupo";
    }
}