package Aula20;

public class Matriz3D {
	public static void main(String[] args) {

		int i = 0, j = 0, k = 0, somaTotal = 0, somaImpar = 0, somaPar = 0;
		int[][][] matriz3D = new int[3][3][3];

		// Atribuindo valores na matriz
		for (i = 0; i < matriz3D.length; i++) {
			for (j = 0; j < matriz3D[i].length; j++) {
				for (k = 0; k < matriz3D[j].length; k++) {
					matriz3D[i][j][k] = (int) (Math.random() * 100);
				}
			}
		}
		// Imprimindo a Matriz e fazendo a soma total da matriz e de cada e soma dos
		// pares e im
		for (i = 0; i < matriz3D.length; i++) {
			for (j = 0; j < matriz3D[i].length; j++) {
				for (k = 0; k < matriz3D[j].length; k++) {
					System.out.println("Matriz[" + i + "][" + j + "][" + k + "]:  " + matriz3D[i][j][k]);
					somaTotal += matriz3D[i][j][k];
					if (matriz3D[i][j][k] % 2 == 0) {
						somaPar += matriz3D[i][j][k];
					} else {
						somaImpar += matriz3D[i][j][k];
					}
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.println(" ");
		}
		System.out.println("A soma total dos elementos é " + somaTotal);
		System.out.println("A soma total dos Pares é " + somaPar);
		System.out.println("A soma total dos Impares é " + somaImpar);

	}

}
