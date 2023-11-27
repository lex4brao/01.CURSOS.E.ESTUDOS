package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int soma = 0;

    System.out.println("\n Vetor : ");
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      soma += vetA[i];
      System.out.print("  "+vetA[i]);
    }

    System.out.println();
    System.out.println("A soma dos elementos do vetor é "+soma);
    System.out.println();
    System.out.println();
  }
}
