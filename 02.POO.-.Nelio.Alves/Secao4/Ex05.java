package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o codigo da peça ");
    int cod = sc.nextInt();
    System.out.print("Digite o valor da peça R$ ");
    double preco = sc.nextDouble();
    System.out.print("Digite a quantidade de peça ");
    int qtd = sc.nextInt();
    double total = preco * qtd;
    System.out.println("total = " + total);
  }
}
