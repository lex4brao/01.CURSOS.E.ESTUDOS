package Aula19;

import java.util.*;

public class Ex76 {
  public static void main (String[] args) {
    Random rnd = new Random();

    int i=0;
    int[] vetorA = new int[8];
    int[] vetorB = new int[vetorA.length];

    System.out.println("\n Imprimindo o vetor A");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(100);
      vetorB[i] = (vetorA[i]*2);
      System.out.println("vetorA["+i+"]: "+vetorA[i]);
    } 
    System.out.println("\n Imprimindo o vetor B");
    for(i=0;i<vetorB.length;i++) {
      System.out.println("vetorB["+i+"]: "+vetorB[i]);
    } 
  
  }
}
