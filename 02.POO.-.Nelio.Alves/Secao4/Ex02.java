package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o raio do circulo ");
    double raio = sc.nextDouble();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.println("area = " + df.format(area));
  }
}
