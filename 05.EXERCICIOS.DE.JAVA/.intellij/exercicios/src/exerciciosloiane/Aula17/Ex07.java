package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numb;
    int soma=0;
    for (int i = 0; i < 5; i++) {
      System.out.print((i+1)+"º valor: ");
      numb = sc.nextInt();
      soma+= numb;
    }
    System.out.println("A soma dos valores digitados é "+soma);
    System.out.println("A média dos valores digitados é "+(soma/5));
  }
}
