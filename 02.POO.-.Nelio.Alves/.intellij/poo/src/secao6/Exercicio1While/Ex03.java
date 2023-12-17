package Secao6.Exercicio1While;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op =0;
    int etanol=0;
    int gas = 0;
    int dies = 0;
    do {
      System.out.println("\nEscolha o combustivel ");
      System.out.println("[1] - Etanol");
      System.out.println("[2] - Gasolina");
      System.out.println("[3] - Diesel");
      System.out.println("[4] - Sair");
      System.out.print(">>  ");
      op = sc.nextInt();
      switch (op){
        case 1:
          etanol++;
          break;
        case 2:
          gas++;
          break;
        case 3:
          dies++;
          break;
        case 4:
          System.out.println("Muito Obrigado");
          break;
        default:
          System.out.println("Opção invalida");
          break;
      }
    }while (op!=4);
    System.out.println();
    System.out.println("Alcool foi votado "+etanol+" vezes");
    System.out.println("Gasolina foi votado "+gas+" vezes");
    System.out.println("Diesel foi votado "+dies+" vezes");
  }
}
