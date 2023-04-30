package Aula15;

import java.util.Scanner;

class Ex19 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a 1ª nota: ");
    double nota1 = scan.nextDouble();
    System.out.print("Digite a 2ª nota: ");
    double nota2 = scan.nextDouble();

    double media = (nota1+nota2)/2;
    System.out.println("A média do aluno é "+media);
    System.out.print("O aluno está ");
    if (media==10){;
      System.out.print("APROVADO COM LOUVOR");
    } else if (media>=7){;
      System.out.print("APROVADO");
    } else {;
      System.out.print("REPROVADO");
    } 
  }

}