package Aula15;

import java.util.Scanner;

class Ex16 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um valor:  ");
    int valor1 = scan.nextInt();
    
    if (valor1>0){;
      System.out.println("O valor "+valor1+" é positivo");
    } else {;
      System.out.println("O valor "+valor1+" é negativo");
    } 

  }
}