package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double salario, percentual;
        double novoSalario;
        System.out.printf("Digite o salário do funcionário ");
        salario = sc.nextDouble();
        System.out.printf("Digite o percentual de aumento do funcionário: ");
        percentual = sc.nextDouble();
        percentual = (percentual/100)+1;
        novoSalario = salario*percentual;
        System.out.printf("O novo salário será R$:"+novoSalario);
    }
}
