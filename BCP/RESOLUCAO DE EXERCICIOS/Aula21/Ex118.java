package Aula21;
import java.util.*;
public class Ex118 {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite a nota do Aluno: ");
	    double nota= scan.nextDouble();
	    System.out.println("");
	    System.out.println((nota>=9)? "A": (nota>=8)? "B": (nota >= 7)? "C": (nota>= 5)? "D": "E");

	  }
}
