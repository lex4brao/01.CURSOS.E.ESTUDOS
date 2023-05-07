package Aula13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a 1ª nota do aluno: ");
		int nota1 = scan.nextInt();
		System.out.print("Digite a 2ª nota do aluno: ");
		int nota2 = scan.nextInt();
		System.out.print("Digite a 3ª nota do aluno: ");
		int nota3 = scan.nextInt();
		System.out.print("Digite a 4ª nota do aluno: ");
		int nota4 = scan.nextInt();

		int med = (nota1+nota2+nota3+nota4)/4;

    System.out.println("\nA média do aluno é: "+med);

	}

}
