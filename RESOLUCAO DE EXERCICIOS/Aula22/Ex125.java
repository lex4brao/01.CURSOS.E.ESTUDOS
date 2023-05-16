package Aula22;
import java.util.*;
public class Ex125 {
	  public static void main (String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int[] vetor = {0,1,2,3,4,5,6,7,8,9,10};
		    int tab=0;
		    System.out.println("Digite o valor da tabuada q deseja");
		    tab = scan.nextInt();
		    for (int i : vetor){
		      System.out.println(i+"*"+tab+"="+(i*tab));   
		}
	  }

}
