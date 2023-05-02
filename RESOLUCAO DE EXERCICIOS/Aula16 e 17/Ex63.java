package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex63 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int i=1;
    double valor=0, total=0, dinheiro=0;
    String resp=" ";
    System.out.println("Loja de Conveniencia");
    do {
      System.out.print("Valor do "+i+"º produto R$:");
      valor = scan.nextDouble();
      total += valor;
      i++;
      System.out.print("Encerrar a compar? [S]im ou [N]ão: ");
      resp = scan.next();
      while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
        System.out.print("Opção invalida digite 'S' para sim e N para não: ");
        resp = scan.next();
      };
    } while(resp.equalsIgnoreCase("S"));
    System.out.println("Total da Compra: "+df.format(valor));
    System.out.print("Qual o valor recebido R$:");
    dinheiro = scan.nextDouble();
    System.out.println("O troco é R$"+df.format(dinheiro-valor));

  }
}
 