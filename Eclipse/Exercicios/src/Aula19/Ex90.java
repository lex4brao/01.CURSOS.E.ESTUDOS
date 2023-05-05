package Aula19;

import java.util.*;

public class Ex90 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0, velho=0, novo=0, posVelho=0, posNovo=1;
    int[] vetorA = new int[10];

    System.out.println("\n Imprimindo o vetor:");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = rnd.nextInt(50);
      if (i==vetorA.length){
        System.out.print("["+i+"]: "+vetorA[i]);
      }
      else {
        System.out.print("["+i+"]:"+vetorA[i]+" - ");
      }
      if (i==0){
        velho=vetorA[i];
        novo=vetorA[i];
      }
      if (vetorA[i]>velho){
        velho=vetorA[i];
        posVelho=i;
      }
      if (vetorA[i]<novo){
        novo=vetorA[i];
        posNovo=i;
      }     
    }
    System.out.println("\n\nO mais velho tem "+velho+" anos na posição "+posVelho);
    System.out.println("O mais novo tem "+novo+" anos na posição "+posNovo);
  }
}
