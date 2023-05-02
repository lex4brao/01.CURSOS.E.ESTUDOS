package Aula17;

import java.util.Scanner;

class Ex57 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, qtd=0;
    double nota=0, soma=0,media=0;
    System.out.println("Calculando a média");
    System.out.print("Qual a quantidade de notas: ");
    qtd = scan.nextInt();
    
    for(i=1;i<=qtd;i++) {
      System.out.print("Digite a "+i+"ª nota: ");
      nota= scan.nextDouble();
      soma+=nota;
    } 
    media = soma/qtd;
    System.out.println("A média é "+media);

  }
}
 