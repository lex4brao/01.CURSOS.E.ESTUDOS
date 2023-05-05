package Aula19;

import java.util.*;
import java.text.DecimalFormat;

public class Ex94 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    DecimalFormat df = new DecimalFormat("#.##");

    int i=0, cont=0;
    int[] vetor = new int[10];

    System.out.println("\n Valores do vetor");
    for(i=0;i<vetor.length;i++) {
      vetor[i] = (int) Math.round(Math.random()*10); 
      System.out.print(vetor[i]+" ");
    }
    for(i=0;i<(vetor.length/2);i++) {
      if (vetor[i]!=(vetor[(vetor.length-1)-i])){
        break;
      } else {
        cont++;
      } 
    }
    if (cont==5){
  	  System.out.println("\nO vetor é Palíndromo");
    } else {
  	  System.out.println("\nO vetor não é Palíndromo");
    }
  }
}
