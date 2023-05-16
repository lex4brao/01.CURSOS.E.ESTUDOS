package Aula22;

import java.util.Random;
import java.util.Scanner;

public class Ex123 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int[] vetor = new int[10];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(10);
		}
		for (int i : vetor) {
			System.out.println(i + " - ");
		}
		System.out.println("Digite o valor que deseja inserir em todos os elementos do vetor ");
		soma = scan.nextInt();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = soma;
		}
		for (int i : vetor) {
			System.out.println(i + " - ");
		}

	}

}
