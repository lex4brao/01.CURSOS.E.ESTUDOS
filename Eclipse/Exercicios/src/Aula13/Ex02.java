package Aula13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number ;

		System.out.println("Digite um numero: ");
		number = scan.nextInt();
	  
		System.out.println("Você digitou o numero "+number);

	}

}
