package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Quantos numeros deseja fatorar: ");
    int n = sc.nextInt();
    int num;
    int fat;
    for (int i = 1; i <=n; i++) {
      System.out.print(i+"º valor: ");
      num = sc.nextInt();
      fat = 1;
      for (int j = 1; j <= num; j++) {
        fat = fat*j;
      }
      System.out.println(num+" !="+fat+"\n");
    }
  }
}
