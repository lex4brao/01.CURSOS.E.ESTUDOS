package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double salario, salarioLiquido;
        double bonus=0.05, ir=0.07;
        System.out.printf("Digite o salario bruto do funcionário R$");
        salario = sc.nextDouble();
        salarioLiquido = (salario+(salario*bonus))-(salario*ir);
        System.out.printf("O salário liquido do funcionário será R$"+salarioLiquido);
    }
}
