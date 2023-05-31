package Aula19;

import java.util.*;

public class Ex86 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0, soma=0;
    int[] vetorA = new int[10];

    System.out.println("\n Imprimindo o vetor:");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(10);
      if (i==(vetorA.length-1)){
        System.out.print("["+i+"]: "+vetorA[i]);
      }
      else {
        System.out.print("["+i+"]:"+vetorA[i]+" - ");
      }  
      soma+=vetorA[i];
    }
    System.out.println("\nA soma dos elementos do vetor é "+soma);
  }
}
