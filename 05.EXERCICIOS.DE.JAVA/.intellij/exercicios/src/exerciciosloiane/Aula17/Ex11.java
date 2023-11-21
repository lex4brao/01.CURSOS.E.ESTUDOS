package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a tabuada de qual numero deseja: ");
    int tab = sc.nextInt();
    for (int i = 0; i <=10 ; i++) {
      System.out.println(i+" * "+tab+" = "+(i*tab));
    }
  }
}
