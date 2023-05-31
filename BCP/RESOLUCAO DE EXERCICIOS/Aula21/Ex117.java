package Aula21;

import java.util.*;

public class Ex117 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = scan.nextInt();
		System.out.println("Digite outro numero numero");
		int num2 = scan.nextInt();
		System.out.println("");
		System.out.println((num > num2) ? num + " e maior que " + num2 : num2 + " e maior que " + num);

	}
}
