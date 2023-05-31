package Aula14;
import java.util.Scanner;

class SwitchCase {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero do dia da semana(1-7:  ");
    int dia = scan.nextInt();

    if (dia==1){;
      System.out.println("Domigo");
    } else if (dia==2){;
      System.out.println("Segunda - Feira");
    } else if (dia==3){;
      System.out.println("Terça - Feira");
    } else if (dia==4){;
      System.out.println("Quarta - Feira");
    } else if (dia==5){;
      System.out.println("Quinta - Feira");
    } else if (dia==6){;
      System.out.println("Sexta - Feira");
    } else if (dia==7){;
      System.out.print("Sabado");
    } else {;
      System.out.println("Não é um dia da semana valido");
    } 
    /* usando a estrutura switch - case */
    switch(dia){
      case 1: System.out.println("Domingo"); break;
      case 2: System.out.println("Segunda"); break;
      case 3: System.out.println("Terça"); break;
      case 4: System.out.println("Quarta"); break;
      case 5: System.out.println("Quinta"); break;
      case 6: System.out.println("Sexta"); break;
      case 7: System.out.println("Sabado"); break;
      default: System.out.println("Não é um dia da semana");
    }

  }
}