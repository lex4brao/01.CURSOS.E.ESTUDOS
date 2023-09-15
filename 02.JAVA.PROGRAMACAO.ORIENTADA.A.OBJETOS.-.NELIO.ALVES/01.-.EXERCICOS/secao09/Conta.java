package secao09;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public void Deposito(double saldo){
        this.saldo += saldo;
    }
    public void Saque(double saldo){
        this.saldo -= saldo;
    }


    public String toString() {
        return  "Conta: " + numero +
                ", Titular: " + nome +
                ", Saldo: " + saldo;
    }
}
