package Aula15;

import java.util.Scanner;

class Ex17 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o sexo [M/F]:  ");
    String sexo = scan.next();

    if (sexo.equalsIgnoreCase("f")){;
      System.out.println("Feminino");
    } else if (sexo.equalsIgnoreCase("m")){;
      System.out.println("Masculino");
    } else {;
      System.out.println("Resoposta inválida");
    } 
 
  }
}