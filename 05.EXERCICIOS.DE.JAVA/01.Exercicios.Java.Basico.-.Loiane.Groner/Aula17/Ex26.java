package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Você deseja ver qual tabuada: ");
    int tab = sc.nextInt();
    int ini, fim;
    System.out.println();
    do {
      System.out.print("Digite o inicio: ");
      ini = sc.nextInt();
      System.out.print("Digite o fim: ");
      fim = sc.nextInt();
      if (ini > fim) {
        System.out.println("\nDigite o inicio menor q o fim");
        System.out.println("Digite novamente\n");
      }
    } while (ini > fim);

    for (int i = ini; i <=fim; i++) {
      System.out.println(tab+"*"+i+"= "+(tab*i));
    }

  }
}
