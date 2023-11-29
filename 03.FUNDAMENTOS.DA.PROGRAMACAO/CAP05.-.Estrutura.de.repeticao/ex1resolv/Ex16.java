package CAP05.ex1resolv;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Area do triangulo: ");
    double base;
    double alt;
    do {
      System.out.print("Base: ");
      base = sc.nextDouble();
      if (base <= 0) {
        System.out.println("Digite uma base maior que 0");
      }
    } while (base <= 0);
    do {
      System.out.print("Altura: ");
      alt = sc.nextDouble();
      if (alt <= 0) {
        System.out.println("Digite uma altura maior que 0");
      }
    } while (alt <= 0);
    double area = (base * alt) / 2;
    System.out.println("A area do triangulo é " + area);
  }
}
