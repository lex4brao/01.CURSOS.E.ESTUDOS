package secao5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero inteiro ");
    int numb = sc.nextInt();
    if (numb >= 0) {
      System.out.print("\nO numero é positivo");
    } else {
      System.out.print("O numero é negativo");
    }
  }
}
