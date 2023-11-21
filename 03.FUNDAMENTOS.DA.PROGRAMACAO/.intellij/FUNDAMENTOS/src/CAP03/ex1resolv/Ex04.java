package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        double salario;
        double novoSalario;
        System.out.println("Digite o salario do funcionário: ");
        System.out.printf("R$: ");
        salario = sc.nextDouble();
        novoSalario = salario * 1.25;
        System.out.println("O salário do funcionário é R$"+df.format(novoSalario));
    }
}
