package secao6.Exercicio1While;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int senha;
    do {
      System.out.println("\n\nDigite sua senha");
      System.out.print(">>  ");
      senha = sc.nextInt();
      if (senha==1234){
        System.out.print("Acesso Permitido");
      } else {
        System.out.print("Acesso negado");
      }
    } while (senha!=1234);
  }
}
