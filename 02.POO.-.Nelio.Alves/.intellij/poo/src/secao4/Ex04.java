package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o codigo do funcionário ");
    double cod = sc.nextDouble();
    System.out.print("Digite as horas trabalhados do funcionario ");
    double horas = sc.nextDouble();
    System.out.print("Digite o valor da hora trabalhada pelo funcionario R$");
    double valor = sc.nextDouble();
    double salario = horas * valor;
    System.out.println("salario = " + df.format(salario));
  }
}
