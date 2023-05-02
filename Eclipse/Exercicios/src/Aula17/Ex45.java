package Aula17;

import java.util.Scanner;

class Ex45 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int maior=0, valor=0;
    System.out.println(" ");
    for(int i=0;i<5;i++) {
      System.out.print("Digite um valor inteiro: ");
      valor=scan.nextInt();
      if (i==0){
        maior=valor;
      }
      if (valor>maior){
        maior=valor;
      } 
    } 
    System.out.println("\nO maior valor digitado é "+maior);

  }
}
 