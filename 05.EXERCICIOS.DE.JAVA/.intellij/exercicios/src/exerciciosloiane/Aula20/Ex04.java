package exerciciosloiane.Aula20;

import java.util.Scanner;

public class Ex04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[][][] age = new String[31][24][24];
    int op = 1;
    int dia = 0;
    int hora = 0;

    while (op != 0) {
      System.out.println("\nAgenda de tarefas");
      System.out.println("Digite a opção desejada: ");
      System.out.println("[1] Adicionar compromisso");
      System.out.println("[2] Verificar Compromisso");
      System.out.println("[0] Para sair");
      System.out.print(">>\t");
      op = sc.nextInt();
      System.out.println();

      if (op == 1) {
        do {
          System.out.print("Dia: ");
          dia = sc.nextInt();
          if (dia <= 0 || dia > 31) {
            System.out.print("Dia inválido\n");
          }
        } while (dia <= 0 || dia > 31);
        do {
          System.out.print("Hora: ");
          hora = sc.nextInt();
          if (hora < 0 || hora > 24) {
            System.out.print("Hora inválida\n");
          }
        } while (hora < 0 || hora > 24);
        sc.nextLine();
        System.out.print("Digite o Compromisso: ");
        age[--dia][hora][hora] = sc.nextLine();
        System.out.println();
      }

      if (op == 2) {
        do {
          System.out.print("Dia: ");
          dia = sc.nextInt();
          if (dia <= 0 || dia > 31) {
            System.out.print("Dia inválido\n");
          }
        } while (dia <= 0 || dia > 31);
        do {
          System.out.print("Hora: ");
          hora = sc.nextInt();
          if (hora < 0 || hora > 24) {
            System.out.print("Hora inválida\n");
          }
        } while (hora < 0 || hora > 24);
        System.out.print("\n\n[" + dia + "] [" + hora + ":00] - "+age[--dia][hora][hora]+"\n\n");
      }

      if (op == 0) {
        System.out.println("Até Logo!");
        break;

      }


    }
  }

}
