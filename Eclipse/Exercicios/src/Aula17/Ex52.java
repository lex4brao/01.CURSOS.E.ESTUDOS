package Aula17;

import java.util.Scanner;

class Ex52 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, valor=0, par=0, impar=0;
    for(i=0;i<10;i++) {
      System.out.println("Digite um valor ");
      valor = scan.nextInt();
      if (valor%2==0){
        par++;
      } else {
        impar++;
      } 
    } 
    System.out.println("Você digitou "+par+" valores pares");
    System.out.println("Você digitou "+impar+" valores impares");

  }
}
 