package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cadastro de membros da turma");
    System.out.print("Quandos membros tem a turma: ");
    int memb = sc.nextInt();
    int idade =0;
    int somaIdades = 0;
    double media;
    for (int i = 1; i <=memb; i++) {
      System.out.print("Idade do Membro: ");
      idade = sc.nextInt();
      somaIdades+=idade;
    }
    media = somaIdades/memb;
    System.out.println("A média de idades da turma é "+media);
    if (media<=25){
      System.out.println("É uma turma jovem");
    } else if (media<=60) {
      System.out.println("É uma turma adulta");
    } else {
      System.out.println("É uma turma idosa");
    }
  }
}
