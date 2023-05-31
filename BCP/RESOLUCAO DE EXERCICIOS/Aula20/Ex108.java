package Aula20;

public class Ex108 {
	public static void main(String[] args) {
		int i = 0, j = 0, maior = 0, posI = 0, posJ = 0;
		int[][] matriz = new int[4][4];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
				if (i == 0 && j == 0) {
					maior = matriz[i][j];
				}
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					posI = i;
					posJ = j;
				}
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("\n O maior valor da matriz é [" + posI + "][" + posJ + "]: " + maior);
	}
}