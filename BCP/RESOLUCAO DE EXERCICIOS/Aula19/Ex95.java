package Aula19;

import java.util.*;
import java.text.DecimalFormat;

public class Ex95 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    DecimalFormat df = new DecimalFormat("#.##");

    int i=0, cont=0;
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];

    System.out.println("\n Valores A do vetor");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i] = (int) Math.round(Math.random()*10); 
      if (vetorA[i]%2==0){
        vetorB[i]=1;
      } else {
        vetorB[i]=0;       
      } 
      System.out.print(vetorA[i]+" ");
    }
    System.out.println("\n Valores B do vetor");
    for(i=0;i<(vetorB.length);i++) {
      System.out.print(vetorB[i]+" ");
    }
  }
}
