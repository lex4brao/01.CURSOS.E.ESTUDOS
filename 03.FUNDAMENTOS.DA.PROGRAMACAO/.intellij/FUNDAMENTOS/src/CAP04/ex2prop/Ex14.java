package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o valor do Salário R$ ");
    double salario = sc.nextDouble();
    if (salario<=300){
      salario = salario*1.5;
      System.out.println("Aumento de 50%");
    } else if (salario<=500) {
      salario = salario*1.4;
      System.out.println("Aumento de 40%");
    } else if (salario<=700) {
      salario = salario*1.3;
      System.out.println("Aumento de 30%");
    } else if (salario<=800) {
      salario = salario*1.2;
      System.out.println("Aumento de 20%");
    } else if (salario<=1000) {
      salario = salario*1.1;
      System.out.println("Aumento de 10%");
    } else {
      salario = salario*1.05;
      System.out.println("Aumento de 5%");
    }
    System.out.println("O salario com aumento será R$"+df.format(salario));
  }
}
