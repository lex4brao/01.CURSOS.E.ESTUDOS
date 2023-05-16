package Aula22;

import java.util.*;

public class Ex122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(100);
		}
		for (int i : vetor) {

			System.out.print(i + " - ");
		}
		System.out.println(" ");

		for (int i : vetor) {
			if (i % 2 == 0) {
				System.out.print(i + " - ");
			}
		}

	}

}
