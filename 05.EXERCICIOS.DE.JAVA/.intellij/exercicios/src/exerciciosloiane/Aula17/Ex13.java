package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numb;
    int par = 0;
    int impar = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print(i+"º valor: ");
      numb = sc.nextInt();
      if (numb%2==0){
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("Foram digitado "+par+" numeros pares");
    System.out.println("Foram digitado "+impar+" numeros impares");
  }
}
