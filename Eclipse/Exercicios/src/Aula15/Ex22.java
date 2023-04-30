package Aula15;

import java.util.Scanner;

class Ex22 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do primeiro produto R$:");
    double valor1= scan.nextDouble();
    System.out.print("Digite o valor do segundo produto R$:");
    double valor2= scan.nextDouble();
    System.out.print("Digite o valor do terceiro produto R$:");
    double valor3= scan.nextDouble();

    if (valor1<valor2 && valor1<valor3){;
      System.out.println("Compre o primeiro produto");
    } else if (valor2<valor1 && valor2<valor3){;
      System.out.println("Compre o segundo produto");
    } else if (valor3<valor1 && valor3<valor2){;
      System.out.println("Compre o terceiro produto");
    } 
  
  }

}