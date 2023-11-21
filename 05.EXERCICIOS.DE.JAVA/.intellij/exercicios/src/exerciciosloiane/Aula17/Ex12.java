package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a base: ");
    int base = sc.nextInt();
    System.out.print("Digite a potencia: ");
    int pot = sc.nextInt();
    double resultado= base;
    for (int i = 1; i < pot; i++) {
      resultado *= base;
    }
    System.out.println("resultado = " + resultado);
    resultado = Math.pow(base,pot);
    System.out.println("resultado = " + resultado);

  }
}
