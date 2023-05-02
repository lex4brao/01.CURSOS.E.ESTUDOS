package Aula17;

import java.util.Scanner;

class Ex47 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int soma=0, valor=0, med=0;
    System.out.println(" ");
    for(int i=0;i<50;i++) {
      if (i%2!=0){
        System.out.print(" - "+i);
      } 
      if (i==21){
        System.out.println(" ");
      } 
    } 

  }
}
 