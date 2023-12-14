package exerciciosloiane.Aula36.Ex01;

/**
 * @author lex4brao
 */
public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
