package exerciciosloiane.Aula43.Ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento)) ;
            return true;
        }
        return false;
    }
    public ContaPoupanca(){

    }

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String nomeCliente, String numeroConta, Double saldo, int diaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
