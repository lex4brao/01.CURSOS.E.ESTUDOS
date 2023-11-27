package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int maior = (int) Double.MIN_VALUE;
    int menor = (int) Double.MAX_VALUE ;

    System.out.println("\n\t      Vetor  ");

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(75) + 10;
      System.out.print("  "+vetA[i]);
      maior = Math.max(vetA[i],maior);
      menor = Math.min(vetA[i], menor);
    }

    System.out.println();
    System.out.println();
    System.out.println("A maior idade do grupo é "+maior);
    System.out.println("A menor idade do grupo é "+menor);
    System.out.println();
    System.out.println();
  }
}
