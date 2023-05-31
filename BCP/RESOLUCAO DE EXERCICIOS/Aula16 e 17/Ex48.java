package Aula17;

import java.util.Scanner;

class Ex48 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, inicio=0, fim=0, med=0;
    System.out.println("Contador Crescente ou Decrescente");
    System.out.println("Digite o valor inteiro do inicio: ");
    inicio = scan.nextInt();
    System.out.println("Digite o valor inteiro do fim: ");
    fim = scan.nextInt();
    if (inicio<fim){
      for(i=inicio;i<=fim;i++) {
        System.out.print(i+" - ");
      } 
    } else {
      for(i=inicio;i>=fim;i--) {
        System.out.print(i+" - ");
      } 
    } 
  }
}
 