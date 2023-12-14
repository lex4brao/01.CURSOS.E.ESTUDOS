package exerciciosloiane.Aula17;

/*
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 * @autorLex4brao
 */
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
