package Aula19;

import java.util.*;

public class Ex85 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0, pares=0;
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
      if(vetorA[i]%2==0){
        pares++;
      }
    }
    System.out.println("\nO vetor tem "+pares+" numeros pares");
  }
}
