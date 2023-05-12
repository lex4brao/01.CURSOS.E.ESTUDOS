package Aula21;
import java.util.*;
public class Ex116 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = scan.nextInt();
		System.out.println("");
		System.out.println((num % 2 == 0) ? "O numero " + num + " é par" : "O numero " + num + " é impar");

	}
}
