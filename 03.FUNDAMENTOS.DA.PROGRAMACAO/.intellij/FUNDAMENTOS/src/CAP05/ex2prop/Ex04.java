package CAP05.ex2prop;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);
    System.out.print("Digite o numero da tabuada: ");
    int tab = sc.nextInt();
    for (int i = 0; i < 10; i++) {
      System.out.println(tab+"*"+i+"= "+(tab*i));
    }
  }
}
