package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int popA = 80000;
    int popB = 200000;
    int cont = 0;
    while (popA<popB){
      popA += popA*0.03;
      popB += popB*0.015;
      cont++;
    }
    System.out.println("Em "+cont+" anos: ");
    System.out.println("População A: "+popA);
    System.out.println("População B: "+popB);
  }
}
