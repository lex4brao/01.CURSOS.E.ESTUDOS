package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int qtdPar = 0;
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      qtdPar = (vetA[i] % 2 == 0) ? (qtdPar + 1) : qtdPar;

    }

    System.out.println("\nVetor ");
    for (int valor:vetA){
      System.out.print("  "+valor);
    }

    System.out.println();
    System.out.println("\nForam encontrados "+qtdPar+" numeros pares que são: ");
    for (int valor: vetA){
      if (valor%2==0){
        System.out.print("  "+valor);
      }
    }

    System.out.println();
    System.out.println();
    System.out.println();
  }
}
