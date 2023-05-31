package Aula17;

import java.util.Scanner;

class Ex46 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int soma=0, valor=0, med=0, i=0;
    System.out.println(" ");
    for(i=0;i<5;i++) {
      System.out.print("Digite um valor inteiro: ");
      valor=scan.nextInt();
      soma+=valor;
    } 
    med = soma/i;
    System.out.println("A soma dos numeros digitados é "+soma);
    System.out.println("A média dos numeros digitados é "+med);

  }
}
 