package Aula22;

import java.util.*;

public class Ex119 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int soma = 0;
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(100);
		}

		for (int i : vetor) {
			soma += i;
			System.out.print(i + " - ");
		}
		System.out.println("\nA soma dos elemento é "+soma);

	}
}
