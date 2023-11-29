package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        double salarioMin, horasTrab;
        System.out.printf("Qual o valor do salário minimo R$ ");
        salarioMin = sc.nextDouble();
        System.out.printf("Quantas horas o funcionário trabalhou ");
        horasTrab = sc.nextDouble();
        double salarioBruto = (horasTrab*(salarioMin/2));
        double imp = salarioBruto*0.03;
        double salarioLiq = salarioBruto-imp;
        System.out.printf("\nO salário liquido do funcionário será R$ "+df.format(salarioLiq));
    }
}
