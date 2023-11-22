package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual termo da sequencia deseja ver: ");
    int termo = sc.nextInt();
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.print("\n"+n1+"-"+n2+"-");
    for (int i = 3; i <=termo; i++) {
      n3 = n1+n2;
      if (i==termo){
        System.out.print(n3);
      } else {
        System.out.print(n3+"-");
      }
      if (i%20==0){
        System.out.print("\n");
      }
      n1 = n2;
      n2 = n3;
    }

  }
}
