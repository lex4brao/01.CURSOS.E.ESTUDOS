package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o Salário R$ ");
    double salarioBruto = sc.nextDouble();
    double bonus = 0;
    if (salarioBruto <= 350) {
      bonus = 100;
    } else if (salarioBruto <= 600) {
      bonus = 75;
    } else if (salarioBruto <= 900) {
      bonus = 50;
    } else if (salarioBruto > 900) {
      bonus = 35;
    }
    System.out.println("Voce receberá um bonus de R$" + df.format(bonus));
    double imp = salarioBruto*0.07;
    System.out.println("Seu imposto é de R$"+df.format(imp));
    double salarioL = (salarioBruto+bonus)-imp;
    System.out.println("O salario liquido será R$"+df.format(salarioL));

  }
}
