package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o Salário R$ ");
    double salario = sc.nextDouble();
    double novoSalario=0;
    if (salario<=300){
      novoSalario = salario*1.35;
      System.out.println("Aumento de 35%");
    } else if (salario>300) {
      novoSalario = salario*1.15;
      System.out.println("Aumento de 15%");
    }
    System.out.println("O novo salario será R$"+df.format(novoSalario));


  }
}
