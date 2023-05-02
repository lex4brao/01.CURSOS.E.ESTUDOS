package Aula17;

import java.util.Scanner;

class Ex56 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, valor=0, resultado=0;
    System.out.println("Verificador de numero primo");
    System.out.print("Digite o numero: ");
    valor = scan.nextInt();
    for(i=1;i<=valor;i++) {
      if (valor%i==0){
        resultado++;
      } 
    } 
    if (resultado>2){
      System.out.println("O numero não é primo");
    } else {
      System.out.println("O numero é primo");
    } 
    

  }
}
 