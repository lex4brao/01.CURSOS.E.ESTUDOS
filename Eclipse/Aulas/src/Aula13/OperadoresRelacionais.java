package Aula13;

import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = scan.nextInt();
		
		boolean resultado = valor1==valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1!=valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1>valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1<valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1>=valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1=valor2;
		System.out.println("O resultado é = "+resultado);
		
	}

}
