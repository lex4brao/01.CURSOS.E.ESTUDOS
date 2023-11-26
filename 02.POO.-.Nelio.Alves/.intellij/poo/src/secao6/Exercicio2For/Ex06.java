package secao6.Exercicio2For;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int num = sc.nextInt();
    for (int i = 1; i <=num ; i++) {
      if (num%i==0){
        System.out.print(" "+i);
      }
    }
  }
}
