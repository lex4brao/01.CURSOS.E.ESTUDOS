package secao8.ex02;

public class Funcionario {
    public String name;
    public double salario;
    public double taxa;

    public double SalarioLiquido(){
        return salario-taxa;
    }
    public double Aumento(double aumento){
        double aux = aumento/100;
        salario = salario*(1+aux);
        return salario;
    }
}
