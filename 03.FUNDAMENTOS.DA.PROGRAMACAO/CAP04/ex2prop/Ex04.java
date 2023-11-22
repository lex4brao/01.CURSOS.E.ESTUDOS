package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Digite um numero ");
    int numb1 = sc.nextInt();
    System.out.println("Digite outro numero ");
    int numb2 = sc.nextInt();
    if (numb1>numb2){
      System.out.println("O maior numero digitado é "+numb1);
    } else if (numb2>numb1) {
      System.out.println("O maior numero digitado é "+numb2);
    }

  }
}
