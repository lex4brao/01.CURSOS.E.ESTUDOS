package CAP03.ex2prop;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Qual o valor da primeira conta");
        double conta1 = sc.nextDouble();
        System.out.println("Qual o valor da segunda conta");
        double conta2 = sc.nextDouble();
        double restoSalario = salario-((conta1+conta2)*1.02);
        System.out.println("Restou R$"+restoSalario);
    }
}
