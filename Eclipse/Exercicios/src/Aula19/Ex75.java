package Aula19;

import java.util.Scanner;

public class Ex75 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int i=0;
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    
    for(i=0;i<vetorA.length;i++) {
      System.out.print("Digite o valor da posição["+i+"]: ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = vetorA[i];
    } 
    System.out.println("\n\tImprimindo o vetor B");
    for(i=0;i<vetorB.length;i++) {
      System.out.println("vetorB["+i+"]: "+vetorB[i]);
    } 
  
  }
}
