package Aula15;

import java.util.Scanner;

class Ex32 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("\nDigite um numero inteiro: ");
    int numero= scan.nextInt();
    if (numero%2==0){
      System.out.println("O numero "+numero+" é um valor par");
    } else {
      System.out.println("O numero "+numero+" é um valor impar");
    } 
  }
}

