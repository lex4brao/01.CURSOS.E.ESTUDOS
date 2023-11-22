package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o Salário R$ ");
    double salario = sc.nextDouble();
    double novoSalario;
    if (salario<=500){
      System.out.println("Terá aumento de Salário");
      novoSalario = salario*1.3;
      System.out.print("O salario será R$"+df.format(novoSalario));
    } else if (salario>500) {
      System.out.println("Não terá aumento de salário");
      novoSalario = salario;
      System.out.print("O salario será R$"+df.format(novoSalario));

    }
  }
}
