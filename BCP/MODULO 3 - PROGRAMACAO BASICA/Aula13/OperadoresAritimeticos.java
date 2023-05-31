package Aula13;

import java.util.Scanner;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = scan.nextInt();
		
		int resultado = valor1+valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1-valor2;
		System.out.println("O resultado é = "+resultado);

		resultado = valor1*valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1/valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1%valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado++;
		System.out.println("O resultado é = "+resultado);
		
		resultado--;
		System.out.println("O resultado é = "+resultado);
		
		int valor = 8;
		System.out.println(valor++);
		valor=8;
		System.out.println(++valor);
		
	}

}
