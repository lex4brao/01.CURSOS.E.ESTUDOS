package exerciciosloiane.Aula19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quantas Cotações: ");
    int qtd = sc.nextInt();

    double[] vetor = new double[qtd];
    double cot;

    for (int i = 0; i < vetor.length; i++) {
      cot = rand.nextDouble(1)+5;
      vetor[i] = cot*i;
      System.out.printf("[%-2d] - %-5.2f | %-5.2f%n", i, cot, vetor[i]);
    }
  }
}
