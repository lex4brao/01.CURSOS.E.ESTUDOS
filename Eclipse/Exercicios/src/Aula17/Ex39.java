package Aula17;

import java.util.Scanner;

class Ex39 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota=0;
    do {
       System.out.println("Digite uma nota entre 0 a 10");
       System.out.print(">> ");
       nota= scan.nextInt();
       if (nota>=0 && nota<=10){
        System.out.println("Você digitou a nota "+nota);
       } else {
        System.out.println("Você digitou uma nota inválida");
       } 
    } while ((nota<0 || nota>10));

  }
}