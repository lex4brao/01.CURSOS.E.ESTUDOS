package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int maior15=0, menor15=0, igual15=0, cont15=0;

    System.out.println("\n\t      Vetor  ");

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      System.out.print("  "+vetA[i]);
      menor15=(vetA[i]<15)?(menor15+vetA[i]):menor15;
      igual15=(vetA[i]==15)?(igual15+1):igual15;
      maior15=(vetA[i]>15)?(maior15*vetA[i]):maior15;
      cont15=(vetA[i]>15)?(cont15+1):cont15;
    }
    double med15 = maior15/cont15;
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("A soma dos elementor menores que 15 é "+menor15);
    System.out.println(igual15+" elementos são igual a 15");
    System.out.println("A média dos elementos maiores que 15 é "+maior15);
  }
}
