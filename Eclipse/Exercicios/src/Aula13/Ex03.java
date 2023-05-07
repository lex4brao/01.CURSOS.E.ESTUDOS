package Aula13;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

	    System.out.print("Digite um valor: ");
	    int num1 = scan.nextInt();
	    System.out.print("Digite um valor: ");
	    int num2 = scan.nextInt();

	    int resultado = num1+num2;

	    System.out.println("\nA Soma de "+num1+" + "+num2+" é igual á "+(num1+num2));
	    System.out.println("\nA Soma de "+num1+" + "+num2+" é igual á "+resultado);
	}

}
