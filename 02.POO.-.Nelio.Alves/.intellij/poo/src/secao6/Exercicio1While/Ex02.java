package Secao6.Exercicio1While;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resp = "s";
    do {
      System.out.println("Digite a coordenada");
      System.out.print("x: ");
      int x= sc.nextInt();
      System.out.print("y: ");
      int y= sc.nextInt();
      if (x>0&&y>0){
        System.out.println("\t1º Quadrante\n");
      } else if (x>0&&y<0) {
        System.out.println("\t2º Quadrante\n");
      } else if (x<0&&y<0) {
        System.out.println("\t3º Quadrante\n");
      } else if (x<0&&y>0) {
        System.out.println("\t4º Quadrante\n");
      }
      System.out.println("Deseja continuar");
      System.out.print("[S]im ou [N]ão: \t");
      resp = sc.next();
    } while (resp.equalsIgnoreCase("s"));

  }
}
