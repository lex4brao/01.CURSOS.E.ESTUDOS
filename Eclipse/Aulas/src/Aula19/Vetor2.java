package Aula19;

import java.util.Scanner;

public class Vetor2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    double[] temperatura = new double[5];
    int i=0;
    
    for(i=0;i<temperatura.length;i++) {
      System.out.print("Digite a temperatura do " + (i+1) + "º dia: ");
      temperatura[i] = scan.nextDouble();
    } 
    for(i=0;i<temperatura.length;i++) {
      System.out.println("Dia " + (i+1) + ": " + temperatura[i]);
    } 

  }
}
