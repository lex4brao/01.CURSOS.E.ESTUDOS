
package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite valor de reais R$");
    double reais = sc.nextDouble();
    double dollar = reais / 1.8;
    double marco = reais / 2;
    double libra = reais / 3.57;
    System.out.println("você pode comprar "+df.format(dollar)+" dolares");
    System.out.println("você pode comprar "+df.format(marco)+" Marco Alemão");
    System.out.println("você pode comprar "+df.format(libra)+" Libras");

  }
}
