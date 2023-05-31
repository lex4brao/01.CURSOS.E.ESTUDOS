package Aula15;

import java.util.Scanner;

class Ex35 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("O que você deseja abastecer: ");
    System.out.println("[A] Alcool R$1.90/l");
    System.out.println("[G] Gasolina R$2,50/l");
    System.out.print("Digite a opção >> ");
    String resp= scan.next();
    System.out.print("\nQuantos litros deseja abastecer: ");
    double litros= scan.nextInt();
    double valor=0;
    if (resp.equalsIgnoreCase("A")){
      if (litros<=20){
        valor = (litros*1.9)*0.97;
        System.out.println("Você obteve 3% de desconto");
      } else if (litros>20){
        valor = (litros*1.9)*0.95;
        System.out.println("Você obteve 5% de desconto");
      } 
    } else if (resp.equalsIgnoreCase("G")){
      if (litros<=20){
        valor = (litros*2.5)*0.96;
        System.out.println("Você obteve 4% de desconto");
      } else if (litros>20){
        valor = (litros*2.5)*0.94;
        System.out.println("Você obteve 6% de desconto");
      } 
    } 
    System.out.println("O valor total do abstecimento é R$:"+valor);
  }
}

