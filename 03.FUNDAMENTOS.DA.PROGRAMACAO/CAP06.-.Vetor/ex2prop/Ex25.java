package CAP06.ex2prop;

import java.util.Random;

public class Ex25 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] vetA = new int[10];
    double[] vetB = new double[10];
    int maior = 0;
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(10) + 1;
      maior = Math.max(maior, vetA[i]);
      System.out.print(vetA[i]+" - ");
    }
    System.out.println();
    for (int i = 0; i <vetB.length ; i++) {
      vetB[i] = (double) vetA[i]/maior;
      System.out.print(vetB[i]+"\n");
    }
  }
}
