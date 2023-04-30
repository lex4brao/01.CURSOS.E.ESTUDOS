package Aula14;
import java.util.Scanner;

class IfElse {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual sua idade?: ");
    int idade = scan.nextInt();

    if (idade>=18){
      System.out.println("Você é maior de idade");
    } else {
      System.out.println("Você é menor de idade");
    }
  }
}