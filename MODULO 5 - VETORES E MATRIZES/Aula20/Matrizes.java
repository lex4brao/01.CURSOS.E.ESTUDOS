package Aula20;

class Matrizes {
	public static void main(String[] args) {

		int i = 0, j = 0;
		double soma = 0;
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		System.out.println("" + notasAlunos.length + " X " + notasAlunos[0].length);

		for (i = 0; i < notasAlunos.length; i++) {
			System.out.println("\nNotas Aluno " + (i + 1));
			soma = 0;
			for (j = 0; j < notasAlunos[i].length; j++) {
				System.out.print("\t" + notasAlunos[i][j]);
				soma += notasAlunos[i][j];
			}
			System.out.println("\nA média do aluno é: " + (soma / j));
			System.out.println(" ");
		}
	}
}