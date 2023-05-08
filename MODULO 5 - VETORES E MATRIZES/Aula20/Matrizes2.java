package Aula20;

public class Matrizes2 {
	public static void main(String[] args) {

		int i=0, j=0;
		double[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15 },{16,17,18,19,20}};

		for (i = 0; i < matriz.length; i++) {
			System.out.println("\nLinha" + i + ": ");
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+", " );
			}
		}

	}
}
