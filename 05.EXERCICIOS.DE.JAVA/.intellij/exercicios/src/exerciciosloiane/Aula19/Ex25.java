package exerciciosloiane.Aula19;

import java.util.Random;

public class Ex25 {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[10];

    for (int i = 0; i < vetC.length ; i++) {
      vetA[i] = rand.nextInt(100);
      vetB[i] = rand.nextInt(100);
      vetC[i] = Integer.compare(vetA[i], vetB[i]);
    }

    System.out.println();
    System.out.println("Vetor A");
    for (int valor: vetA){
      System.out.printf(" %3d ",valor);
    }

    System.out.println();
    System.out.println("Vetor B");
    for (int valor: vetB){
      System.out.printf(" %3d ",valor);
    }

    System.out.println();
    System.out.println("Vetor C");
    for (int valor: vetC){
      System.out.printf(" %3d ",valor);
    }
  }
}
