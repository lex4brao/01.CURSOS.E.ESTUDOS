package exerciciosloiane.Aula19;

import java.util.Random;

public class Ex24 {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(20)+1;
      vetB[i] = (vetA[i]%2==0)?1:0;
    }

    System.out.println("Vetor A ");
    for (int valor:vetA){
      System.out.printf(" %3d ",valor);
    }
    System.out.println();

    System.out.println("Vetor B ");
    for (int valor:vetB){
      System.out.printf(" %3d ",valor);
    }
    System.out.println();
    System.out.println();
  }
}
