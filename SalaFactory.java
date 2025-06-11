public class salaFactory {
    public static Sala criarSala(String tipo, String nome){
        switch(tipo.toLowerCase()){
            case "individual":
                return new SalaIndividual(nome);

            case "grupo":
                    return new SalaGrupo(nome);

            case "laboratorio":
                    return new SalaLaboratorio(nome);

            default:
                throw new illegalArgumentException("Tipo de sala descinhecido:" + tipo);

         }
    }
}