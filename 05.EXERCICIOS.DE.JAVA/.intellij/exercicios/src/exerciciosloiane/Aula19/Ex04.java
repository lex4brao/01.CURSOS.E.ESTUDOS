package exerciciosloiane.Aula19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    double vetB[] = new double[qtd];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(10) + 1;
      vetB[i] = Math.sqrt(vetA[i]);
    }
    System.out.println("\n\nVetor A");
    for (int i = 0; i < vetA.length; i++) {
      System.out.print("  [" + i + "] = " + vetA[i]);
    }

    System.out.println("\n\nVetor B");
    for (int i = 0; i < vetB.length; i++) {
      System.out.print("  [" + i + "] = " + df.format(vetB[i]));
    }
    System.out.println();
    System.out.println();
    System.out.println();
  }
}
