package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero inteiro ");
    int numb = sc.nextInt();
    if (numb % 2 == 0) {
      System.out.println("O numero é par");
    } else {
      System.out.println("O numero é impar");
    }

  }
}
