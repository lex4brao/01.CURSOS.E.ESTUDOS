package CAP06.ex1resolv;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int[] gabarito = new int[10];
    char resp;

    System.out.println("Gabarito: ");

    for (int i = 0; i < gabarito.length; i++) {
      gabarito[i] = rand.nextInt(5) + 1;
      System.out.printf("[%d]=", (i + 1));
      resp = (gabarito[i] == 1) ? 'A' : (gabarito[i] == 2) ? 'B' : (gabarito[i] == 3) ? 'C' : (gabarito[i] == 4) ? 'D' : 'E';
      System.out.printf("\" %c \"%n", resp);
    }
    System.out.println();
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.println("Correção Aluno " + (i+1));
      int pontos = 0;
      int[] aluno = new int[gabarito.length];

      for (int j = 0; j < aluno.length; j++) {
        aluno[j] = rand.nextInt(5) + 1;
        System.out.printf("[%d]=", (j + 1));
        resp = (aluno[j] == 1) ? 'A' : (aluno[j] == 2) ? 'B' : (aluno[j] == 3) ? 'C' : (aluno[j] == 4) ? 'D' : 'E';
        System.out.printf("\" %c \"", resp);

        pontos = (aluno[j] == gabarito[j]) ? (pontos + 1) : pontos;
      }
      System.out.println();
      System.out.print("O aluno fez " + pontos+" pontos o aluno esta ");
      System.out.println((pontos>7)?"Aprovado\n\n":"Reprovado\n\n");
    }
  }
}
