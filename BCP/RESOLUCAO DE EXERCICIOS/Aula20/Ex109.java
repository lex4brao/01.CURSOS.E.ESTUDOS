package Aula20;

public class Ex109 {
	public static void main(String[] args) {
		int i = 0, j = 0, maior5 = 0, menor5 = 0, maior7 = 0, menor7 = 0;
		int[][] matriz = new int[10][10];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
				// linha 5
				if (i == 5 && j == 0) {
					maior5 = matriz[i][j];
					menor5 = matriz[i][j];
				}
				if (matriz[5][j]>maior5) {
					maior5 = matriz[i][j];
				}
				if (matriz[5][j] < menor5) {
					menor5 = matriz[i][j];
				}
				// linha 7
				if (i == 7 && j == 0) {
					maior7 = matriz[i][j];
					menor7 = matriz[i][j];
				}
				if (matriz[7][j] > maior5) {
					maior7 = matriz[i][j];
				}
				if (matriz[7][j] < menor5) {
					menor7 = matriz[i][j];
				}
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nO maior valor da linha 5 é " + maior5);
		System.out.println("O menor valor da linha 5 é " + menor5);
		System.out.println("\nO maior valor da linha 7 é " + maior7);
		System.out.println("O menor valor da linha 7 é " + menor7);
	}
}
