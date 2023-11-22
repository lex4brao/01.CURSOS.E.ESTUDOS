package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o Salario Bruto R$:");
    double salarioB = sc.nextDouble();
    double imposto = 0;
    if (salarioB<200){
      imposto = 0;
    } else if (salarioB>=200&&salarioB<=450) {
      imposto = salarioB*0.03;
    } else if (salarioB>450&&salarioB<700) {
      imposto = salarioB*0.08;
    } else if (salarioB>700) {
      imposto = salarioB*0.12;
    }
    System.out.println("Digite quando anos de tempo de trabalho: ");
    int tempTrab = sc.nextInt();
    double bonus=0;
    if (salarioB>500){
      if (tempTrab<=3){
        bonus = 20;
      } else {
        bonus = 30;
      }
    } else if (salarioB<=500) {
      if (tempTrab<=3){
        bonus = 23;
      } else if (tempTrab>3&&tempTrab<=6) {
        bonus = 35;
      } else if (tempTrab>6) {
        bonus = 33;
      }
    }
    double salarioL = (salarioB+bonus)-imposto;
    System.out.println("Você receberá um bonus de R$"+bonus);
    System.out.println("O seu imposto é R$"+imposto);
    System.out.println("O salario liquido será R$"+salarioL);


  }
}
