package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int maior35=0;

    System.out.println("\n\t      Vetor  ");

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(75) + 10;
      System.out.print("  "+vetA[i]);
      maior35=(vetA[i]>35)?(maior35+1):maior35;
    }
    System.out.println();
    System.out.println();
    System.out.println(maior35+" pessoas tem mais de 35 anos");
  }
}
