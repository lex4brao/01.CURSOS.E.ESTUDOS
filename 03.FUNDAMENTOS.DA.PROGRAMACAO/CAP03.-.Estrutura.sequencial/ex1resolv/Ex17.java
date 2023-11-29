package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        double salario, cheq1, cheq2;
        System.out.printf("Digite o Salario R$ ");
        salario = sc.nextDouble();
        System.out.printf("Digite o valor do cheque R$ ");
        cheq1 = sc.nextDouble();
        System.out.printf("Digite o valor do outro cheque R$ ");
        cheq2 = sc.nextDouble();
        double saldo = salario-((cheq1*(0.38/100))+(cheq2*(0.38/100))+cheq1+cheq2);
        System.out.println("\nO saldo da conta é R$ "+df.format(saldo));
    }
}
