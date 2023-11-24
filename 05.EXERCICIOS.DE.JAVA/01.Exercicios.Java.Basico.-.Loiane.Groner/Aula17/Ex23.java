package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n**** CALCULADORA DE FATORAL ****");
    System.out.print("Qual numero deseja fatorar: ");
    int numb= sc.nextInt();
    double fat = 1;
    System.out.print(numb+" != ");
    for (int i = (numb); i >=1 ; i--) {
      fat*=i;
      if (i!=1){
      System.out.print(i+"*");
      } else {
        System.out.print(i);
      }
    }
    System.out.print(" = "+fat);
  }
}
