package aula78;

import java.util.Scanner;

public class Agenda {
    private String nome;
    private String email;
    private long tel;

    public Agenda(String nome, String email, long tel) {
        this.nome = nome;
        this.email = email;
        this.tel = tel;
    }

    public Agenda(String nome, long tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTel() {
        return tel;
    }

    public String toString(){
        return "Nome: "+getNome()
                +"\nE-mail: "+getEmail()
                +"\nTelefone: "+getTel();
    }

}
