package secao5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite a hora de inicio do jogo ");
    int ini = sc.nextInt();
    System.out.print("Digite a hora do termino do jogo ");
    int fim = sc.nextInt();
    int duracao;
    if (ini < fim) {
      duracao = fim - ini;
      System.out.println("duracao = " + duracao);

    } else {
      duracao = (24 - ini) + fim;
      System.out.println("duracao = " + duracao);


    }
  }
}
