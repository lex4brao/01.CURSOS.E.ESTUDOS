package Aula17;

import java.util.Scanner;

class Ex51 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, base=0, exp=0, resultado=0;
    System.out.println("Digite o qual a base: ");
    base = scan.nextInt();
    System.out.println("Digite o qual o expoente: ");
    exp = scan.nextInt();
    resultado = base;
    for(i=1;i<exp;i++) {
      resultado *= base;
    }
    System.out.println("O resultado de "+base+" elevado a "+exp+" é igual a "+resultado); 

  }
}
 