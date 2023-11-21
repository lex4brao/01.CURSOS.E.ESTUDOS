package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero para iniciar a contagem: ");
    int n1 = sc.nextInt();
    System.out.print("Digite um numero para terminar a contagem: ");
    int n2 = sc.nextInt();
    int soma=0;
    for (int i = (n1+1); i < n2; i++) {
      soma += i;
    }
    System.out.println("soma = " + soma);
  }
}
