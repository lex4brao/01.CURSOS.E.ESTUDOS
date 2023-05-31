package Aula19;

import java.util.*;

public class Ex88 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0, somaMenor15=0, somaIgual15=0;
    double somaMaior15=0, contMaior15=0;
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
      if (vetorA[i]==15){
        somaIgual15+=vetorA[i];
      } else if (vetorA[i]<15){
        somaMenor15+=vetorA[i];
      } else if (vetorA[i]>15){
        somaMaior15+=vetorA[i];
        contMaior15++;
      }   
    }
    System.out.println("\nA soma dos elementos menor que 15 é "+somaMenor15);
    System.out.println("A soma dos elementos igual a 15 é "+somaIgual15);
    System.out.println("A média dos elementos maior que 15 é "+(somaMaior15/contMaior15));
  }
}
