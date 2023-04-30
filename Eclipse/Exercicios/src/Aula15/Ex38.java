package Aula15;

import java.util.Scanner;

class Ex38 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("CAIXA ELETRONICO");
    System.out.println("SAQUE MINIMO R$10,00");
    System.out.println("SAQUE MAXIMO R$600,00");
    System.out.println("NOTAS R$2, R$5, R$10, R$20, R$50, R$100");
    System.out.println("Qual valor deseja sacar");
    System.out.print(">>  ");  
    int valor = scan.nextInt();
    int nota2=0;
    int nota5=0;
    int nota10=0;
    int nota20=0;
    int nota50=0;
    int nota100=0;
    int restovalor=0;
    nota100=valor/100;
    restovalor=valor%100;
    nota50=restovalor/50;
    restovalor=restovalor%50;
    nota20=restovalor/20;
    restovalor=restovalor%20;
    nota10=restovalor/10;
    restovalor=restovalor%10;
    nota5=restovalor/5;
    restovalor=restovalor%5;
    nota2=restovalor/2;
    System.out.println("O valor do saque é R$"+valor);
    System.out.print("Sendo ");
    if (nota100>0){
      System.out.println("\t "+nota100+" notas de R$100");
    } 
    if (nota50>0){
      System.out.println("\t "+nota50+" notas de R$50");
    } 
    if (nota20>0){
      System.out.println("\t "+nota20+" notas de R$20");
    } 
    if (nota10>0){
      System.out.println("\t "+nota10+" notas de R$10");
    } 
    if (nota5>0){
      System.out.println("\t "+nota5+" notas de R$5");
    } 
    if (nota2>0){
      System.out.println("\t "+nota2+" notas de R$2");
    } 
  }
}

