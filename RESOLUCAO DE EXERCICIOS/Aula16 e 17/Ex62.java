package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex62 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int i=0;
    double valor=0, valorund=0;
    System.out.println("Padaria Pão Duro");
    System.out.print("Qual o valor do pão: R$");
    valorund = scan.nextDouble();
    System.out.println(" ");
    System.out.println("Tabela de Preço");
    System.out.println("Qtd\t Preço");
    for(i=1;i<=100;i++) {
      valor=i*valorund;
      System.out.println(" "+i+"\t"+" R$"+df.format(valor));
    } 

  }
}
 