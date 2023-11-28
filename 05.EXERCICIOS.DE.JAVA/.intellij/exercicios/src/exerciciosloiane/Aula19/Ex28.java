package exerciciosloiane.Aula19;

import java.util.Random;

public class Ex28 {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[vetA.length+ vetB.length];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(20);
      vetB[i] = rand.nextInt(20);
      vetC[i] = vetA[i];
      vetC[vetA.length+i] = vetB[i];
    }

    System.out.println();
    for (int valor: vetA){
      System.out.printf(" %2d ", valor);
    }


    System.out.println();
    for (int valor: vetB){
      System.out.printf(" %2d ", valor);
    }


    System.out.println();
    for (int valor: vetC){
      System.out.printf(" %2d ", valor);
    }


  }
}
