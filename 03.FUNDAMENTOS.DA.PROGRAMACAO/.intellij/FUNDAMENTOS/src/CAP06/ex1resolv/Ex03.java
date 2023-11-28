package CAP06.ex1resolv;

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
    int vetC[] = new int[qtd + qtd];
    int j = 0;
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      vetC[j] = vetA[i];
      j++;
      vetB[i] = rand.nextInt(50) + 1;
      vetC[j] = vetB[i];
      j++;
    }

    System.out.println();
    System.out.println("\t\tVetor A");
    for(int valor: vetA){
      System.out.print("  "+valor);
    }

    System.out.println();
    System.out.println("\t\tVetor B");
    for(int valor: vetB){
      System.out.print("  "+valor);
    }

    System.out.println();
    System.out.println("\t\tVetor C");
    for(int valor: vetC){
      System.out.print("  "+valor);
    }
  }
}
