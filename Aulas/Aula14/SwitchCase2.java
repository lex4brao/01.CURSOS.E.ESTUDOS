package Aula14;
import java.util.Scanner;

class SwitchCase2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero do dia da semana :");
    int dia = scan.nextInt();
    switch(dia){
      case 2: System.out.println("Dia util"); 
      case 3: System.out.println("Dia util"); 
      case 4: System.out.println("Dia util"); 
      case 5: System.out.println("Dia util"); 
      case 6: System.out.println("Dia util"); break;
      case 1: System.out.println("Final de Semana");
      case 7: System.out.println("Final de Semana"); break;
    }

  }
}