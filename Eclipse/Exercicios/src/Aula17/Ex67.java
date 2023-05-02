package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex67 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");
    
    int ref=0, soma=0, i=0, j=0;
    
    System.out.println("Encontrando numeros primos");
    System.out.print("Até que numero deseja encontrar: ");
    ref = scan.nextInt();
    System.out.println("O numeros primos até "+ref+" são: ");
    for(i=1;i<=ref;i++) {
      soma=0;
      for(j=1;j<=i;j++) {
        if (i%j==0){
          soma++;
        } 
      } 
      if (soma==2){
        System.out.print(i+" - ");
      } 
    } 

  }
}
 
 
 