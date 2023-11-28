package exerciciosloiane.Aula19;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quandos Alunos: ");
    int qtd = sc.nextInt();
    
    double[] notas1 = new double[qtd];
    double[] notas2 = new double[qtd];
    double[] media = new double[qtd];

    for (int i = 0; i < media.length; i++) {
      notas1[i] = rand.nextDouble(10)+1;
      notas2[i] = rand.nextDouble(10)+1;
      media[i] = (notas1[i]+notas2[i])/2;
      System.out.printf("Aluno [%02d]: ",i);
      System.out.printf(" | %-5.2f", notas1[i]);
      System.out.printf(" | %-5.2f", notas2[i]);
      System.out.printf(" |Media:  %-5.2f", media[i]);
      String situ;
      situ = (media[i]<3)?"Reprovado":(media[i]<7)?"Exame":"Aprovado";
      System.out.printf(" | %-10s%n", situ);
    }
    
  }
}
