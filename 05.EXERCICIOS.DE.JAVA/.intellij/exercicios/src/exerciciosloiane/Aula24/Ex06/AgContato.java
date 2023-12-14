package exerciciosloiane.Aula24.Ex06;

public class AgContato {
private String nome;
private String telefone;
private String email;

public AgContato(){

}

public AgContato(String nome, String telefone, String email) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}
