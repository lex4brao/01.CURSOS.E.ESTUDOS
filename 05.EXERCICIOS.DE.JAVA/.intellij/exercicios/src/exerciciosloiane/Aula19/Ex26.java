package exerciciosloiane.Aula19;

import java.util.Random;

public class Ex26 {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] vetA = new int[10];
    char[] vetB = new char[vetA.length];

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(15)+1;
      vetB[i] = (vetA[i]<7)?'A':(vetA[i]==7)?'B':(vetA[i]>7&&vetA[i]<10)?'C':
              (vetA[i]==10)?'D':'E';
    }
    for (int valor: vetA){
      System.out.printf(" %-2d ",valor);
    }
    System.out.println();
    for (char valor: vetB){
      System.out.printf(" %2c ", valor);
    }
  }
}
