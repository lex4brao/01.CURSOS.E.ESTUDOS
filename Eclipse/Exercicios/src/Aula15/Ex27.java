package Aula15;

import java.util.Scanner;

class Ex27 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o numedo do dia da semana [1 a 7]:");
    int dia= scan.nextInt();
    
    switch (dia){
      case 1: System.out.println("Domingo"); break;
      case 2: System.out.println("Segunda"); break;
      case 3: System.out.println("Terça"); break;
      case 4: System.out.println("Quarta"); break;
      case 5: System.out.println("Quinta"); break;
      case 6: System.out.println("Sexta"); break;
      case 7: System.out.println("Sabado"); break;
      default : System.out.println("Dia inválido");
    }
  }
}

