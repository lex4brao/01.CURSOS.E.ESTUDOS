package Aula15;

import java.util.Scanner;

class Ex28 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1= scan.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2= scan.nextDouble();
    
    double media = (nota1+nota2)/2;
    System.out.print("\nO aluno obteve média ");
    if (media<=10 && media>=9){;
      System.out.print("A\n");
      System.out.println("Aprovado");
    } else if (media<9 && media>=7.5){;
      System.out.print("B\n");    
      System.out.println("Aprovado");
    } else if (media<7.5 && media>=6){;
      System.out.print("C\n");
      System.out.println("Aprovado");
    } else if (media<6 && media>=4){;
      System.out.print("D\n");
      System.out.println("Reprovado");
    } else if (media<4 && media>=0){;
      System.out.print("E\n");
      System.out.println("Reprovado");
    } 

  }
}

