package Aula17;

import java.util.Scanner;

class Ex53 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, valor1=0, valor2=0, valor3=0, qtd=0;
    System.out.println("Quantos valor da sequncia Fibonacci você deseja: ");
    qtd = scan.nextInt();
    valor1 = 0;
    valor2 = 1;
    System.out.print(valor1+" - "+valor2);
    for(i=0;i<qtd;i++) {
      valor3 = valor1+valor2;
      valor1 = valor2;
      valor2 = valor3;
      System.out.print(" - "+valor3);
    } 

  }
}
 