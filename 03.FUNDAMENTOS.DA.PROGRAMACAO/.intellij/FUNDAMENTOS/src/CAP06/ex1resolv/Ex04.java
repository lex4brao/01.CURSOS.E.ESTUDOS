package CAP06.ex1resolv;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int[] vetA = new int[qtd];
    int[] vetB = new int[qtd];
    int[] vetC = new int[qtd];

    System.out.println("\n Vetor");
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(10) + 1;
      vetB[i] = (vetA[i] % 2 == 0) ? vetA[i] : 0;
      vetC[i] = (vetA[i] % 2 != 0) ? vetA[i] : 0;
      System.out.print("  " + vetA[i]);
    }

    System.out.println("\n\n Vetor par");
    for (int valor : vetB) {
      if (valor != 0) {
        System.out.print("  " + valor);
      }
    }
    System.out.println("\n\n Vetor par");
    for (int valor : vetC) {
      if (valor != 0) {
        System.out.print("  " + valor);
      }
    }
  }
}
