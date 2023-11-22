package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean notaValida = false;
    double nota;
    do {
      System.out.print("Digite uma nota: ");
      nota = sc.nextDouble();
      if (nota>=0&&nota<=10){
        notaValida = true;
        System.out.println("Voce digitou uma nota valida");
      } else {
        System.out.println("Voce digitou uma nota invalida");
      }
    }while (!notaValida);
  }
}
