package Aula19;

import java.util.*;

public class Ex78 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0;
    int[] vetorA = new int[15];
    double[] vetorB = new double[vetorA.length];

    System.out.println("\n Imprimindo o vetor A");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(100);
      vetorB[i] = Math.sqrt(vetorA[i]);
      System.out.println("vetorA["+i+"]: "+vetorA[i]);
    } 
    System.out.println("\n Imprimindo o vetor B");
    for(i=0;i<vetorB.length;i++) {
      System.out.println("vetorB["+i+"]: "+vetorB[i]);
    } 
  
  }
}
