package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas notas deseja cadastrar: ");
    int qtdNotas = sc.nextInt();
    double nota = 0;
    double somaNotas = 0;
    double media;
    for (int i = 1; i <=qtdNotas ; i++) {
      System.out.print(i+"ª nota: ");
      nota = sc.nextDouble();
      somaNotas+=nota;
    }
    media = somaNotas/qtdNotas;
    System.out.print("A média do aluno é "+media);
  }
}
