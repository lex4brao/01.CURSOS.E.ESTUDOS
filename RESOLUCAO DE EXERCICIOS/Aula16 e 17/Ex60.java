package Aula17;

import java.util.Scanner;

class Ex60 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, qtd=0;
    double cd=0, soma=0,media=0;
    System.out.println("Cadastro de CDs");
    System.out.print("Qual a quantidade de CDs deseja cadastrar: ");
    qtd = scan.nextInt();
    for(i=1;i<=qtd;i++) {
      System.out.print(i+"º CD valor R$");
      cd = scan.nextDouble();
      soma+=cd;
    } 
    media = soma/qtd;
    System.out.println("Você gastou um total deR$"+soma);
    System.out.println("A média de preço de cada cd é R$"+media);

  }
}
 