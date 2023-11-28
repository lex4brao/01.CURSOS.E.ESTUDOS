package exerciciosloiane.Aula19;

import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros deseja gerar : ");
    int qtd = sc.nextInt();

    int[] vet = new int[qtd];
    int con0  = 0, con1 = 0;
    for (int i = 0; i < vet.length; i++) {
      vet[i] = (int) Math.round(Math.random()*1);
      con0 = (vet[i]==0)?(con0+1):con0;
      con1 = (vet[i]==1)?(con1+1):con1;
      System.out.printf(" [%-1d] ",vet[i]);
    }

    double perc = (double) con0/qtd;
    System.out.println("\n");
    System.out.println((perc*100)+"% do vetor é de 0");
    perc = (double) con1/qtd;
    System.out.println((perc*100)+"% do vetor é de 1");
  }
}
