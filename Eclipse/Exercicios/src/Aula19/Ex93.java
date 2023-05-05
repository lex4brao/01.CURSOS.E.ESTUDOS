package Aula19;

import java.util.*;
import java.text.DecimalFormat;

public class Ex93 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    DecimalFormat df = new DecimalFormat("#.##");

    int i=0, qtd=0, qtd1=0;
    int[] vetor = new int[10];

    System.out.println("\n Valores do vetor");
    for(i=0;i<vetor.length;i++) {
      vetor[i] = (int)Math.round(Math.random())*1;
      System.out.print(vetor[i]+" - ");
      if (vetor[i]==0){
        qtd++;
      }  else {
        qtd1++;
      } 
    }
    double porc0 = (qtd*100)/vetor.length;
    double porc1 = (qtd1*100)/vetor.length;
    System.out.println("\nPorcentagem de 0s: "+porc0+"%");
    System.out.println("Porcentagem de 1s: "+porc1+"%");
  }
}
