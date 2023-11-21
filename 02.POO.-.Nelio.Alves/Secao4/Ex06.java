package secao4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o valor de A: ");
    double a = sc.nextDouble();
    System.out.print("Digite o valor de B: ");
    double b = sc.nextDouble();
    System.out.print("Digite o valor de C: ");
    double c = sc.nextDouble();
    double triangulo = (a * c) / 2;
    System.out.println("triangulo = " + triangulo);
    double circulo = Math.PI * Math.pow(c, 2);
    System.out.println("circulo = " + circulo);
    double trapezio = (c*(a + b)) / 2;
    System.out.println("trapezio = " + trapezio);
    double quadrado = b * b;
    System.out.println("quadrado = " + quadrado);
    double retangulo = a * b;
    System.out.println("retangulo = " + retangulo);
  }
}
