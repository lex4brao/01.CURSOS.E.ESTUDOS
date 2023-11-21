package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as medidas do triangulo ");
    System.out.print("Lado A: ");
    double a = sc.nextDouble();
    System.out.print("Lado B: ");
    double b = sc.nextDouble();
    System.out.print("Lado C: ");
    double c = sc.nextDouble();
    if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
      System.out.println("As medidas formam um triangulo");
      if (a == b && b == c) {
        System.out.println("É um triangulo Equilátero");
      } else if (a == b || a == c || b == c) {
        System.out.println("É um triangulo Isósceles");
      } else if (a != b && a != c && b != c) {
        System.out.println("É um triangulo Escaleno");
      }
    } else {
      System.out.println("As medidas não formam um triangulo");
    }
  }
}
