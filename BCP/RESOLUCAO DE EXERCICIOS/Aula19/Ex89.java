package Aula19;

import java.util.*;

public class Ex89 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0, cont35=0;
    int[] vetorA = new int[10];

    System.out.println("\n Imprimindo o vetor:");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(100);
      if (i==vetorA.length){
        System.out.print("["+i+"]: "+vetorA[i]);
      }
      else {
        System.out.print("["+i+"]:"+vetorA[i]+" - ");
      }
      if (vetorA[i]>35){
        cont35++;
      }   
    }
    System.out.println("\nTem "+cont35+" pessoas maiores que 35 anos");
  }
}
