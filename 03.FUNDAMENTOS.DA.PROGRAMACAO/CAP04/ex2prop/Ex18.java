package CAP04.ex2prop;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();
    if (idade>18){
      System.out.print("Voce pode tirar CNH");
    } else {
      System.out.print("Voce não pode tirar CNH");
    }
  }
}
