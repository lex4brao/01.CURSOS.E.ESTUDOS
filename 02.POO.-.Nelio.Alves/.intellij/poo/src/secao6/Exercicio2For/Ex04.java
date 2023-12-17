package Secao6.Exercicio2For;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");


    System.out.print("Quantos teste deseja: ");
    int qtd = sc.nextInt();
    for (int i = 0; i < qtd; i++) {
      double n1 = rand.nextDouble(10);
      double n2 = rand.nextDouble(10);
      System.out.println("Teste " + i+" : "+df.format(n1)+" / "+df.format(n2)+" = "+df.format(n1/n2));

    }
  }
}
