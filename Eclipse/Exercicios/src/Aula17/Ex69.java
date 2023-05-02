package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex69 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    int i=1; 
    double salario=0, percentual=0;
    System.out.print("Qual o salario do funcionário R$:");
    salario=scan.nextDouble();
    System.out.print("Qual o percentual de aumento:");
    percentual=scan.nextDouble();
    salario += salario*(percentual/100);
    for(i=1997;i<=2023;i++) {
      percentual *=2;
      salario += salario*(percentual/100);
      System.out.println("Em "+i+" O aumento será de "+df.format(percentual)+" ficou R$"+df.format(salario));
    } 


  }
}
 
 
 