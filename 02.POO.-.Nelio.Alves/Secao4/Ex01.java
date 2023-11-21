package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite uma valor inteiro ");
    double n1 = sc.nextDouble();
    System.out.print("Digite outro valor inteiro ");
    double n2 = sc.nextDouble();
    double soma = n1+n2;
    System.out.println("soma = " + soma);

  }
}
