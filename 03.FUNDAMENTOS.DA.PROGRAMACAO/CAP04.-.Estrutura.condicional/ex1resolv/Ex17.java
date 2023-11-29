package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Resolver equação de 2º Grau");
    System.out.print("Digite o valor de A: ");
    double a = sc.nextDouble();
    System.out.print("Digite o valor de B: ");
    double b = sc.nextDouble();
    System.out.print("Digite o valor de C: ");
    double c = sc.nextDouble();
    double delta = Math.pow(b,2)-(4*a*c);
    double x1=0,x2=0;
    System.out.println();
    if (delta<0){
      System.out.println("Não existe raiz real");
    } else if (delta==0) {
      System.out.println("Exite uma raiz real");
      x1 = (-b+ Math.sqrt(delta))/(2*a);
      System.out.println("x1 = " + x1);
    } else if (delta>0) {
      x1 = (-b+ Math.sqrt(delta))/(2*a);
      x2 = (-b- Math.sqrt(delta))/(2*a);
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);


    }

  }
}
