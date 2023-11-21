package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o valor de A: ");
    double a = sc.nextDouble();
    System.out.print("Digite o valor de B: ");
    double b = sc.nextDouble();
    System.out.print("Digite o valor de C: ");
    double c = sc.nextDouble();
    System.out.print("Digite o valor de D: ");
    double d = sc.nextDouble();
    double diferença = ((a*b)-(c*d));
    System.out.println("diferença = " + diferença);
  }
}
