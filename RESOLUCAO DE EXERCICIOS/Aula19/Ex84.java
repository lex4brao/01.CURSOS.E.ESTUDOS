package Aula19;

import java.util.*;

public class Ex84 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0;
    int[] vetorA = new int[15];
    int[] vetorB = new int[vetorA.length];

    System.out.println("\n Imprimindo o vetor:");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(100);
      vetorB[i] = (vetorA[i]%2);
      System.out.print("["+i+"]:"+vetorA[i]+" - ");
    } 
    System.out.println("\n Imprimindo o vetor B:");
    for(i=0;i<vetorB.length;i++) {
      System.out.print("["+i+"]:"+vetorB[i]+" - ");
    } 
  
  }
}
