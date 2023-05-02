package Aula17;

import java.util.Scanner;

class Ex58 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, qtd=0;
    double idade=0, soma=0,media=0;
    System.out.println("Idade da Turma");
    System.out.print("Qual a quantidade de membros da turma: ");
    qtd = scan.nextInt();
    for(i=1;i<=qtd;i++) {
      System.out.print("Digite a idade "+i+"ª idade: ");
      idade = scan.nextDouble();
      soma+=idade;
    } 
    media= soma/qtd;
    
    if (media>=0 && media<=30){
      System.out.println("É uma turma jovem");
    } else if (media>30 && media<=60){
      System.out.println("É uma turma adulta");
    } else {
      System.out.print("É uma turma idosa");
    }


  }
}
 