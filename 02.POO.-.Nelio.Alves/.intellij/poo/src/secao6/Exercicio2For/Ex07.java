package Secao6.Exercicio2For;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      System.out.println("["+i+"]\tQuadrado: "+Math.pow(i,2)+"\t Cubo: 1"+Math.pow(i,3));
    }
  }
}
