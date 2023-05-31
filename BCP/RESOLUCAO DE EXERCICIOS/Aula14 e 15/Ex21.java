package Aula15;

import java.util.Scanner;

class Ex21 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int valor1= scan.nextInt();
    System.out.print("Digite outro numero: ");
    int valor2= scan.nextInt();
    System.out.print("Digite outro numero: ");
    int valor3= scan.nextInt();

    if (valor1>valor2&& valor1>valor3) {;
      System.out.println("O maior valor é "+valor1);
    } else if (valor2>valor1 && valor2>valor3){;
      System.out.println("O maior valor é "+valor2);
    } else if (valor3>valor1 && valor3>valor2){;
      System.out.println("O maior valor é "+valor3);
    }
    if (valor1<valor2 && valor1<valor3){;
      System.out.println("O menor valor é "+valor1);
    } else if (valor2<valor1 && valor2<valor3){;
      System.out.println("O menor valor é "+valor2);
    } else if (valor3<valor1 && valor3<valor2){;
      System.out.println("O menor valor é "+valor3);
    } else {;
      System.out.println("Parâmetros insuficientes");
    } 
  
  }

}