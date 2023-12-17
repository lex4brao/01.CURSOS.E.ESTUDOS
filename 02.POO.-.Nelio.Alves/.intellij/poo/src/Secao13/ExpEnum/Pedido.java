package Secao13.ExpEnum;

public class Pedido {
    private int id;
    private String nome;
    private Status status;

    public Pedido(int id, String nome, Status status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
    }

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
