package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex61 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");

    int i=0;
    double valor=0;
    System.out.println("Tabela de Preço - Loja quase 2");
    System.out.println("Qtd\t Preço");
    for(i=1;i<=100;i++) {
      valor=i*1.99;
      System.out.println(" "+i+"\t"+" R$"+df.format(valor));
    } 

  }
}
 