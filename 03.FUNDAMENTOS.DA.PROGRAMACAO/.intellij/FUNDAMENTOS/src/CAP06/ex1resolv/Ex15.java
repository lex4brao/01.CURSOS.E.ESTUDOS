package CAP06.ex1resolv;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o tamanho do maior vetor: ");
    int qtd = sc.nextInt();
    int[] vetA = new int[qtd];
    int[] vetB = new int[qtd/2];
    for (int i = 0; i <vetA.length ; i++) {
      vetA[i] = rand.nextInt(20)+1;
    }
    for (int i = 0; i < vetB.length; i++) {
      vetB[i]= rand.nextInt(10)+1;
    }
    for (int valor: vetA){
      System.out.printf(" %-2d  ", valor);
    }
    System.out.println();
    for (int valor: vetB){
      System.out.printf(" %-2d  ", valor);
    }
    System.out.println();

    for (int i = 0; i < vetA.length; i++) {
      System.out.println("O numero "+vetA[i]+" é divisivel por: ");
      int cont =0;
      for (int valor:vetB){
        if (vetA[i]%valor==0){
          System.out.printf("\t%-2d ",valor);
          cont++;
        }
      }
      if (cont==0){
        System.out.print("Não tem valores divisiveis");
      }
        System.out.println("\n");
    }
  }
}
