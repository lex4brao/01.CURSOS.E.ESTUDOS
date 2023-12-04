package CAP06.ex2prop;

import java.util.Arrays;
import java.util.Random;

public class Ex17 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[vetA.length+ vetB.length];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(10)+1;
      vetB [i]= rand.nextInt(10)+1;
      vetC[i] = vetA[i];
      vetC[(vetC.length-vetA.length)+i]=vetB[i];
    }
    Arrays.sort(vetC);
    for (int i = 0; i < vetC.length / 2; i++) {
      int temp = vetC[i];
      vetC[i] = vetC[vetC.length - 1 - i];
      vetC[vetC.length - 1 - i] = temp;
    }
    for (int valor: vetA){
      System.out.print(valor+" - ");
    }
    System.out.println();
    for (int valor: vetB){
      System.out.print(valor+" - ");
    }
    System.out.println();
    for (int valor: vetC){
      System.out.print(valor+" - ");
    }
  }
}
