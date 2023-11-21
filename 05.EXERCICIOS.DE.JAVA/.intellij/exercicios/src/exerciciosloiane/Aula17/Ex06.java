package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numb, maior=0;
    for (int i = 0; i < 5 ; i++) {
      System.out.print((i+1)+"º valor: ");
      numb=sc.nextInt();
      if (i==0){
        maior=numb;
      }
      if (maior<numb){
        maior = numb;
      }
    }
    System.out.println("o maior numero digitado é "+maior);
  }
}
