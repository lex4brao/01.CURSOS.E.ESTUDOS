package secao09;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        Deposito(saldo);
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Deposito(double saldo) {
        this.saldo += saldo;
    }

    public void Saque(double saldo) {
        this.saldo -= saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + numero +
                "\nTitular: " + nome +
                "\nSaldo: " + saldo;
    }
}
