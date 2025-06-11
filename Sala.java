public abstract class Sala{
    private String nome;

public Sala(String nome){
    this.nome = nome;
}
public String getNome(){
    return nome;
}
public abstract String getTipo();

}