package Aula20;

import java.util.Scanner;

public class Ex111 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j, k, resp, mes, dia, hora;
		String[][][] agenda = new String[31][12][8];
		for (i = 0; i < agenda.length; i++) {
			for (j = 0; j < agenda[i].length; j++) {
				for (k = 0; k < agenda[i][j].length; k++) {
					agenda[i][j][k] = ("Sem Tarefas cadastradas");
				}
			}
		}

		do {
			System.out.println("\nDigite a Opção de sua escolha");
			System.out.println("[1] - Consultar agenda");
			System.out.println("[2] - Cadastrar tarefa na agenda");
			System.out.println("[3] - Sair");
			System.out.print(">>>  ");
			resp = scan.nextInt();

			if (resp == 1) {
				System.out.println("\nConsulta de Tarefas");
				do {
					System.out.print("Digite o dia a ser consultado 1 até 31: ");
					dia = scan.nextInt();
					if (dia < 1 || dia > 31) {
						System.out.println("Dia inválido");
					}

				} while (dia < 1 || dia > 31);

				do {
					System.out.print("Digite o mês a ser consultado 1 até 12: ");
					mes = scan.nextInt();
					if (mes < 1 || mes > 12) {
						System.out.println("Dia inválido");
					}

				} while (mes < 1 || mes > 12);

				do {
					System.out.print("Digite o horario a ser consultado 10hrs ás 18hrs: ");
					hora = scan.nextInt();
					if (hora < 0 || hora > 23) {
						System.out.println("Hora inválida");
					}
				} while (hora < 0 || hora > 18);
				System.out.println("\nDia: " + (dia) + " - " + (hora) + ":00hrs");
				System.out.println(agenda[dia - 1][mes - 1][hora - 10]);
			}

			if (resp == 2) {
				System.out.println("\nCadastro de Tarefas");
				do {
					System.out.print("Digite o dia a ser Cadastrando 1 até 31: ");
					dia = scan.nextInt();
					if (dia < 1 || dia > 31) {
						System.out.println("Dia inválido");
					}

				} while (dia < 1 || dia > 31);

				do {
					System.out.print("Digite o mês a ser Cadastrando 1 até 12: ");
					mes = scan.nextInt();
					if (mes < 1 || mes > 12) {
						System.out.println("Dia inválido");
					}

				} while (mes < 1 || mes > 12);

				do {
					System.out.print("Digite o horario a ser Cadastrando 10hrs ás 18hrs: ");
					hora = scan.nextInt();
					if (hora < 0 || hora > 23) {
						System.out.println("Hora inválida");
					}
				} while (hora < 0 || hora > 18);
				scan.nextLine();
				System.out.println("Digite a tarefa a ser cadastrada");
				agenda[dia - 1][mes - 1][hora - 10] = scan.nextLine();
				;
				System.out.println("\nDia: " + (dia) + " - " + (hora) + ":00hrs");
				System.out.println(agenda[dia - 1][mes - 1][hora - 10]);
			}

		} while (resp != 3);

	}
}
