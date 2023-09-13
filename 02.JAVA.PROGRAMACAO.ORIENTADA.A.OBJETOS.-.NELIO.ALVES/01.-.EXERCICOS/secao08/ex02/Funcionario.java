package secao08.ex02;

public class Funcionario {
    public String nome;
    public  double salarioBruto;
    public double imposto;
    public double salarioLiquido(){
        return salarioBruto-imposto;
    }
    public void Aumento(double aumento){
        aumento = aumento/100;
        this.salarioBruto = salarioBruto*(1+aumento);
    }
    public String toString(){
        return "funcionario: "
                +nome
                +",  R$: "
                +String.format("%.2f",salarioLiquido());
    }
}
