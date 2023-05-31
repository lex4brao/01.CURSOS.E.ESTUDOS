package Aula22;
import java.util.*;
public class Ex120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Random rnd = new Random();
	    int maior=0;
	    int[] vetor = new int[10];

	    for(int i=0;i<vetor.length;i++) {
	      vetor[i] = rnd.nextInt(100);
	    } 

	    for(int i: vetor){
	      System.out.print(i+" - ");
	      if(i>maior){
	        maior=i;
	      }
	    }
	    System.out.println("");
	    System.out.println("O maior valor é "+maior);



	}

}
