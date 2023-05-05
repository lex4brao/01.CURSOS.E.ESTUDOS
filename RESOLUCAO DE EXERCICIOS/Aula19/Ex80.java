package Aula19;

import java.util.*;

public class Ex80 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0;
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    int[] vetorC = new int[vetorA.length];

    System.out.println("\n Imprimindo o vetor A");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(100);
      vetorB[i] = rnd.nextInt(100);
      vetorC[i] = vetorA[i]+vetorB[i];
      System.out.println("vetorA["+i+"]: "+vetorA[i]);
    } 
    System.out.println("\n Imprimindo o vetor B");
    for(i=0;i<vetorB.length;i++) {
      System.out.println("vetorB["+i+"]: "+vetorB[i]);
    } 
    System.out.println("\n Imprimindo o vetor C");
    for(i=0;i<vetorB.length;i++) {
      System.out.println("vetorB["+i+"]: "+vetorC[i]);
    } 
  
  }
}
