package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Investimentos");
    System.out.print("Valor do investimento: ");
    double invet = sc.nextDouble();
    double invet2 = invet/3;
    int meses =0;
    do {
      invet = invet*1.02;
      invet2 = invet2*1.05;
      meses++;
    } while (invet2<=invet);
    System.out.println("Em "+meses+" meses");
    System.out.println("O menor investimento será R$"+df.format(invet2));
    System.out.println("O maior investimento será R$"+df.format(invet));
  }
}
