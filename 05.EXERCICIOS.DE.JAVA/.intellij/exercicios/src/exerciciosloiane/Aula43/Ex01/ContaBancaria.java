package exerciciosloiane.Aula43.Ex01;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private Double saldo;
    public ContaBancaria(){

    }

    public ContaBancaria(String nomeCliente, String numeroConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        this.saldo+=valor;
    }
    public boolean Sacar(double valor){
        if (saldo>=valor){
        this.saldo-=valor;
        return true;
        }
        return false;
    }
}
