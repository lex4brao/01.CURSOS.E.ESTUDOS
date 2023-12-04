package CAP06.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Qual o tamanho do vetor: ");
    int qtd = sc.nextInt();

    int[] vet = new int[qtd];

    System.out.println();
    for (int i = 0; i < vet.length; i++) {
      vet[i] = rand.nextInt(50) + 1;
      System.out.print(vet[i]+"  ");
    }

    System.out.println();
    System.out.println("\nMultipos de 2: ");
    for (int valor : vet) {
      System.out.print((valor % 2 == 0) ? ("  " + valor) : "");
    }

    System.out.println();
    System.out.println("\nMultipos de 3: ");
    for (int valor : vet) {
      System.out.print((valor % 3 == 0) ? ("  " + valor) : "");
    }



    System.out.println();
    System.out.println("\nMultipos de 2 e 3: ");
    for (int valor : vet) {

      System.out.print((valor % 2 == 0) ? ("  " + valor) : "");
      System.out.print((valor % 3 == 0) ? ("  " + valor) : "");
    }


  }
}
