package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex68 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");
    
    int inicio=0, fim=0, tabuada=0, i=0;

    System.out.print("Deseja qual tabuada: ");
    tabuada = scan.nextInt();
    System.out.print("Qual numero inicia a tabuada: ");
    inicio = scan.nextInt();
    System.out.print("Qual numero termina a tabuada: ");
    fim = scan.nextInt();

    for(i=inicio;i<=fim;i++) {
      System.out.println("\t"+i+"*"+tabuada+" = "+(i*tabuada));
    } 

  }
}
 
 
 