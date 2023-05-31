package Aula15;

import java.util.Scanner;

class Ex25 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o salario do funcionário R$:");
    double entrada= scan.nextDouble();
    if (entrada<=280){;
      System.out.println("O aumento será de 20%");
      System.out.println("terá um aumento de R$"+(entrada*0.2));
      System.out.println("Seu novo salario será R$"+(entrada*1.2));
    } else if (entrada>280 && entrada<=700){;
      System.out.println("O aumento será de 15%");
      System.out.println("terá um aumento de R$"+(entrada*0.15));
      System.out.println("Seu novo salario será R$"+(entrada*1.15));
    } else if (entrada>700 && entrada<=1500){;
      System.out.println("O aumento será de 10%");
      System.out.println("terá um aumento de R$"+(entrada*0.1));
      System.out.println("Seu novo salario será R$"+(entrada*1.1));
    } else if (entrada>1500){;
      System.out.println("O aumento será de 5%");
      System.out.println("terá um aumento de R$"+(entrada*0.05));
      System.out.println("Seu novo salario será R$"+(entrada*1.05));
    } 
    
  }

}