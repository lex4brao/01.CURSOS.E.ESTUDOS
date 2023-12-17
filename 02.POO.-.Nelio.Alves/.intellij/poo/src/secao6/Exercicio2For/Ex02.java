package Secao6.Exercicio2For;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros deseja cadastrar: ");
    int qtd = sc.nextInt();
    int numero;
    int in=0;
    int out=0;
    for (int i = 1; i <=qtd ; i++) {
      System.out.print(i+"º cadratro: ");
      numero = sc.nextInt();
      if (numero>=10&&numero<=20){
        in++;
      }else {
        out++;
      }
    }
    System.out.println("Foram cadastrasdos");
    System.out.println(in+" numeros dentro do intervalo de 10 a 20");
    System.out.println(out+" numeros fora do intervalo de 10 a 20");
  }
}
