package exerciciosloiane.Aula19;

import java.util.Random;

public class Ex30 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] vetA = new int[15];
    double[] vetB = new double[vetA.length];
    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = i;
      double fatorial = 1;
      for (int j = 1; j < vetA[i]; j++) {
        fatorial+=(fatorial*j);
      }
      vetB[i]=fatorial;
    }
    System.out.println();
    for (int valor : vetA){
      System.out.printf(" %-7d ", valor);
    }
    System.out.println();
    for (double valor: vetB){
      System.out.printf(" %-7.0f ", valor);
    }
  }
}
