package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o maior numero que deseja na lista: ");
    int num = sc.nextInt();
    boolean primo;

    System.out.println("\nLista de numero primos");
    for (int i = 1; i <=num ; i++) {
      primo = true;
      for (int j = 2; j < i; j++) {
        if (i%j==0){
          primo = false;
          break;
        }
      }
      if (primo){
        System.out.print(i+" ");
      }

    }
  }
}
