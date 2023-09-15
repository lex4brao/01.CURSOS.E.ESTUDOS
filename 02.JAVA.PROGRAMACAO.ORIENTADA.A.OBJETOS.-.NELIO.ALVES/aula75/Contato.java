package aula75;


public class Contato {
    private String nome;
    private int cel;
    private String email;
    public Contato (String nome, int cel, String email){
        this.nome = nome;
        this.cel = cel;
        this.email = email;
    }
    public Contato (String nome, int cel){
        this.nome = nome;
        this.cel = cel;
        this.email = "sem e-mail";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString (){
        return "\n------------------------------"
                +"\nNome: "
                +nome
                +"\nCel: "
                +cel
                +"\nE-mail: "
                +email
                +"\n------------------------------\n";
    }
}
