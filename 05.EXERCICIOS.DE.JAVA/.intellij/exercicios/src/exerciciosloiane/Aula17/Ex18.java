package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o numero que deseja verificar: ");
    int numb = sc.nextInt();
    boolean isPrimo = true;
    for (int i = 2; i < numb; i++) {
      if (numb % i == 0) {
        isPrimo = false;
        break;
      }
    }
    if (isPrimo){
      System.out.println("O numero é primo");
    } else {
      System.out.println("O numero não é primo");
    }
  }
}
