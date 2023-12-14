package exerciciosloiane.Aula24.Ex06;

public class Contato {
String nome;

AgContato[] contato;
public Contato(){

}

public Contato(String nome, AgContato[] contato) {
    this.nome = nome;
    this.contato = contato;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public AgContato[] getContato() {
    return contato;
}

public void setContato(AgContato[] contato) {
    this.contato = contato;
}
}
