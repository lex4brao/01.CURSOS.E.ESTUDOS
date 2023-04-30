package Aula15;

import java.util.Scanner;

class Ex24 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Em que turno você estuda");
    System.out.print("\nDigite [M] Manhã [V] Vespertino [N]Noturno: ");
    String entrada= scan.next();
    switch(entrada){
      case "m":
      case "M": System.out.println("Bom dia"); break;
      case "v":
      case "V": System.out.println("Boa Tarde"); break;
      case "n":
      case "N": System.out.println("Boa Noite"); break;
      default : System.out.println("Opção Inválida");
    }
    
  }

}