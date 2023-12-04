package CAP06.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Qual o tamanho do vetor: ");
    int qtd = sc.nextInt();
    int contP = 0;
    int contI = 0;
    int[] vet = new int[qtd];

    System.out.println();
    for (int i = 0; i < vet.length; i++) {
      vet[i] = rand.nextInt(50) + 1;
      contP = ((vet[i] % 2) == 0) ? (contP + 1) : contP;
      contI = ((vet[i] % 2) != 0) ? (contI + 1) : contI;

      System.out.print(vet[i]+"  ");
    }

    System.out.println();
    System.out.println();
    System.out.println("Foram encontrados " + contP + " numeros pares");
    for (int valor : vet) {
      System.out.print((valor % 2 == 0) ? ("  " + valor) : "");
    }
    System.out.println();
    System.out.println("Foram encontrados " + contI + " numeros impares");
    for (int valor : vet) {
      System.out.print((valor % 2 != 0) ? ("  " + valor) : "");

    }

  }
}
