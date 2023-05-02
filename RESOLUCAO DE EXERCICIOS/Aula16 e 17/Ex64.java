package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex64 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");

    int i=1, valor=0, fatorial=1;
    System.out.println("Fatorial V2.0");
    System.out.print("Qual valor deseja o Fatorial: ");
    valor = scan.nextInt();
    System.out.print(valor+"! = ");
    for(i=valor;i>=1;i--) {
      fatorial*=i;
      if (i!=1){
        System.out.print(i+" * ");
      } else {
        System.out.print(i+" = ");
        
      } 
    } 
    System.out.print(fatorial);
  }
}