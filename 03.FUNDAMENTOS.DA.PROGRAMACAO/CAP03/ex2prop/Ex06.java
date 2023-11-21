package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double salario, vendas;
        System.out.printf("Qual é o salario do vendedor R$");
        salario = sc.nextDouble();
        System.out.printf("Qual o valor total de vendas R$");
        vendas = sc.nextDouble();
        double salarioFinal = salario+(vendas*0.04);
        System.out.println("O salario do funcionário será R$"+df.format(salarioFinal));


    }
}
