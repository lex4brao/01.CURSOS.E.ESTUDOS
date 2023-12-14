package exerciciosloiane.Aula36.Ex02;

public class Professor {
    private String nome;
    private String email;
    private String depertamento;
    public Professor(){

    }

    public Professor(String nome, String email, String depertamento) {
        this.nome = nome;
        this.email = email;
        this.depertamento = depertamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepertamento() {
        return depertamento;
    }

    public void setDepertamento(String depertamento) {
        this.depertamento = depertamento;
    }
}
