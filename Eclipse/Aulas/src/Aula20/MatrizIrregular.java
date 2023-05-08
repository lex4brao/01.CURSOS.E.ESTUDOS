package Aula20;

import java.util.Scanner;

public class MatrizIrregular {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0, j=0;

		System.out.print("Quandas pessoas serão entrevistadas:  ");
		int numEntrevistas = scan.nextInt();

		String[][] nomeFilhos = new String[numEntrevistas][];

		for (i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Entrevista"+(i+1));
			System.out.print("Quantos filhos?: ");
			int qdtFilhos = scan.nextInt();

			// criando a instancia para que a quantidade de colunas seja igual a qantidade de filho
			nomeFilhos[i] = new String[qdtFilhos];

			for (j = 0; j < nomeFilhos[i].length; j++) {
				System.out.print("Digite o nome do " + (j + 1) + "ºfilho:  ");
				nomeFilhos[i][j] = scan.next();
			}
		}
		// Imprimindo o resultado das entrevistas
		for (i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Pessoa " + (i + 1) + " tem " + nomeFilhos[i].length + " filhos que são");
			for (j = 0; j < nomeFilhos[i].length; j++) {
				System.out.println("\t" + nomeFilhos[i][j]);
			}
		}

	}

}
