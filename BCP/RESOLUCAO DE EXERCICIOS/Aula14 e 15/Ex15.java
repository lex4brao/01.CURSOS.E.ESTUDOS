package Aula15;

import java.util.Scanner;

class Ex15 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um valor:  ");
    int valor1 = scan.nextInt();
    System.out.print("Digite outro valor: ");
    int valor2 = scan.nextInt();

    if (valor1>valor2){;
      System.out.println("\nO valor "+valor1+" é maior que "+valor2);
    } else {;
      System.out.println("\nO valor "+valor2+" é maior que "+valor1);
    } 
  }
}