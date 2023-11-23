package secao6.Exercicio2For;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int num = sc.nextInt();
    System.out.println("Os numeros impares de 0 até "+num+" são");
    for (int i = 0; i <=num ; i++) {
      if (i%2!=0){
        System.out.print(i+" - ");
      }
    }
  }
}
