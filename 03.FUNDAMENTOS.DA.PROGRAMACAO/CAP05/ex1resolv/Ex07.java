package CAP05.ex1resolv;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n*** Sequencia Fibonacci ***");
    System.out.print("Quantos termos da sequencia: ");
    int termos = sc.nextInt();
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.print(n1+" - "+n2+" - ");
    for (int i = 2; i < termos; i++) {
      n3 = n1+n2;
      System.out.print(n3+" - ");
      n1 = n2;
      n2 = n3;
    }
  }
}
