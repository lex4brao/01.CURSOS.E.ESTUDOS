package Aula20;

import java.util.Scanner;

public class Ex110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0, j = 0, par = 0, impar = 0;
		int[][] matriz = new int[3][3];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "][" + j + "}:  ");
				matriz[i][j] = scan.nextInt();
				if (matriz[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nA matriz tem " + par + " numeros Pares");
		System.out.println("A matriz tem " + impar + " numeros Impares");
	}
}
