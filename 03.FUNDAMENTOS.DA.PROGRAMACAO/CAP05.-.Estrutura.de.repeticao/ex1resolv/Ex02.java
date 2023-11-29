package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero inteiro: ");
    int n = sc.nextInt();
    double e = 1;
    double fat;
    for (int i = 1; i < n; i++) {
      fat = 1;
      for (int j = 1; j < i; j++) {
        fat = fat/j;
      }
      e = e+(1/fat);
    }
    System.out.println("O resultado é "+e);
  }
}
