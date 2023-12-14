package exerciciosloiane.Aula43.Ex01;

public class ContaEspecial extends ContaBancaria{
    double limite;
    public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            ;
            return true;
        }

        return false;
    }


}
