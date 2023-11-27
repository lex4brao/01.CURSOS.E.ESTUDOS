package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int vetB[] = new int[qtd];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      vetB[i] = vetA[i] * vetA[i];
    }
    System.out.println("\n\nVetor A");
    for (int i = 0; i < vetA.length; i++) {
      System.out.print("  [" + i + "] = " + vetA[i]);
    }

    System.out.println("\n\nVetor B");
    for (int i = 0; i < vetB.length; i++) {
      System.out.print("  [" + i + "] = " + vetB[i]);
    }
    System.out.println();
    System.out.println();
    System.out.println();
  }
}
