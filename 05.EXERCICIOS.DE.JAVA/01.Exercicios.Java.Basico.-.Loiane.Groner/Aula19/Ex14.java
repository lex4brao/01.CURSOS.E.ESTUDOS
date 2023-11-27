package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int vetA[] = new int[qtd];
    int soma = 0, med=0, cont=0;

    System.out.println("\n Vetor : ");

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = rand.nextInt(50) + 1;
      System.out.print("  "+vetA[i]);
      cont = (vetA[i]%2!=0)?(cont+1):cont;
    }
    System.out.println();
    System.out.println();
    System.out.println("Foram encontrados "+cont+" numeros impares");
    for (int valor : vetA){
      if (valor%2!=0){
        soma+=valor;
        System.out.print("  "+valor);
      }
    }
    med = soma/cont;
    System.out.println();
    System.out.println();
    System.out.println("A soma dos numeros impares é "+soma);
    System.out.println("A média dos numeros impares é "+med);

  }
}
