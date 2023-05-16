package Aula22;
import java.util.*;
public class Ex121 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] vetor = new int[10];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(10);
		}

		for (int i : vetor) {
			System.out.print(i + " - ");
			if (i % 5 == 0) {
				soma++;
			}
		}
		if (soma > 0) {
			System.out.println("\nO numero 5 está presente no vetor, " + soma + " vezes");

		}
	}
}
