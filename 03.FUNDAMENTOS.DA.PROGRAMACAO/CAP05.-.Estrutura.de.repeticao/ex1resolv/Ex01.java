package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Calculo de Aumento de Salario ");
    int anoAtual = LocalDate.now().getYear();
    System.out.print("Qual o ano de contratação: ");
    int anoIni = sc.nextInt();
    System.out.print("Qual o salário R$");
    double salario = sc.nextDouble();
    double percent = 1.5/100;
    double novoSalario = salario*(1+percent);
    for (int i = (anoIni+1); i < anoAtual; i++) {
      percent*=2;
      novoSalario = novoSalario*(1+percent);
    }
    System.out.println("O novo salário será R$"+novoSalario);
  }
}
