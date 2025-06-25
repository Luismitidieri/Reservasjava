public class User {
    private String nome;
    private String tipo;

    public User(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }
}