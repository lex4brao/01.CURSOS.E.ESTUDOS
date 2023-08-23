package secao10.pensionato;

public class Quarto {
    private String nome;
    private String email;

    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    @Override
    public String toString() {
        return "Nome: "+this.nome+"\tE-mail: "+this.email;
    }
}
