package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero para iniciar a contagem: ");
    int n1 = sc.nextInt();
    System.out.print("Digite um numero para terminar a contagem: ");
    int n2 = sc.nextInt();
    for (int i = n1; i <= n2; i++) {
      if (i==n2){
        System.out.print(i);
      } else {
        System.out.print(i+" - ");
      }
    }
  }
}
