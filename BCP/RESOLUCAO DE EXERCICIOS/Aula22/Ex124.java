package Aula22;
import java.util.*;
public class Ex124 {
	  public static void main (String[] args) {
		    Random rnd = new Random();
		    int[] vetor = new int[10];
		    int soma=0;

		    for(int i=0;i<vetor.length;i++) {
		      vetor[i] = rnd.nextInt(10);
		    } 
		    for (int i : vetor){
		      System.out.println(i);
		      soma+=i;
		    }
		    System.out.println("A média dos valores do vetor é: "+(soma/vetor.length));
		    }
}
