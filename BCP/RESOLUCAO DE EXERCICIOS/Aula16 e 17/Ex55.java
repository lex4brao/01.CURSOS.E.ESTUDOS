package Aula17;

import java.util.Scanner;

class Ex55 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, valor=0, fatorial=1;
    System.out.println("Calculando um fatorial");
    System.out.print("Digite o numero que deseja o fatorial: ");
    valor = scan.nextInt();
    if (valor==0){
      System.out.print("O fatorial de "+valor+" é 1");
    } else {
      for(i=valor;i>=1;i--) {
        fatorial *= i;
        System.out.print(i+"");
      };
      System.out.println("O fatorial de "+valor+" é igual "+fatorial);
    } 
    

  }
}
 