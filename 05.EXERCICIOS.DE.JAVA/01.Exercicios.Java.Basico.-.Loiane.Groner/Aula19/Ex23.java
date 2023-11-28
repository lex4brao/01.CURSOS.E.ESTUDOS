package exerciciosloiane.Aula19;

import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetA = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
    int[] vetB = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean palindromo = true;

    for (int i = 0; i < vetA.length; i++) {
      if (vetA[i]!=vetA[vetA.length-1-i]){
        palindromo = false;
        System.out.println("O vetor não é um palíndromo");
        break;
      }
    }
    if (palindromo){
      System.out.println("O vetor é um palíndromo");
    }

    for (int i = 0; i < vetB.length; i++) {
      if (vetB[i]!=vetB[vetB.length-1-i]){
        palindromo = false;
        System.out.println("O vetor não é um palíndromo");
        break;
      }
    }
    if (palindromo){
      System.out.println("O vetor é um palíndromo");
    }


  }
}
