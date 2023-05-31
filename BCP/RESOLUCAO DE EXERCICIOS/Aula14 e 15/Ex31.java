package Aula15;

import java.util.Scanner;

class Ex31 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("\nDigite um ano [AAAA]: ");
    int ano= scan.nextInt();
    if (ano%4==0 && ano%100!=0 || ano%400==0){
      System.out.println("É um ano bisexto");
    } else {
      System.out.println("Não é ano bisexto");
    } 
  } 
}

