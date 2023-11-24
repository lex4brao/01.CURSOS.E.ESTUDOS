package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("A sequencia vai até que termo: ");
    int termo = sc.nextInt();
    double s1 = 1;
    double s2 = 1;
    double soma = 0;
    for (int i = 1; i <= termo; i++) {
      if (i == termo) {
        System.out.print("( " + s1 + "/" +s2+ " )");
      } else {
        System.out.print("( "+s1+"/"+s2+" ) + ");
      }
      soma +=(s1/s2);
      s1++;
      s2+=2;
    }
    System.out.print(" = "+soma);
  }
}
