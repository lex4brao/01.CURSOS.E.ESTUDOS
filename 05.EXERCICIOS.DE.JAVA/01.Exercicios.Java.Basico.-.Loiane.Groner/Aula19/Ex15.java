package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int contPar=0, contImp=0;

    System.out.println("\n Vetor : ");

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      System.out.print("  "+vetA[i]);
      contPar = (vetA[i]%2==0)?(contPar+1):contPar;
      contImp = (vetA[i]%2!=0)?(contImp+1):contImp;
    }
    double percPar = ((double) contPar /qtd)*100;
    double percImp = ((double) contImp /qtd)*100;

    System.out.println();
    System.out.println();
    System.out.println(percPar+"% do vetor é Par");
    System.out.println(percImp+"% do vetor é Impar");
  }
}
