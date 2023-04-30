package Aula15;

import java.util.Scanner;

class Ex36 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Frutaria do zé: ");
    System.out.println("Até 5kg");
    System.out.println("\tMaçã R$1.80kg");
    System.out.println("\tMorango R$2.50kg");
    System.out.println("Acima de 5kg");
    System.out.println("\tMaçã R$1.50kg");
    System.out.println("\tMorango R$2.2kg");
    System.out.println("Digite [Ma] para/ Maçã");
    System.out.println("Digite [Mo] para/ Morango");
    System.out.print(">> ");
    String resp = scan.next();
    System.out.println("\nQuantos Kg deseja comprar");
    System.out.print(">> ");
    double kg = scan.nextInt();
    double valor =0;  
    if (resp.equalsIgnoreCase("Ma")){
      if (kg<=5){
        valor=1.8*kg;
      } else if (kg>5){
        valor=1.5*kg;
      } 
    } else if (resp.equalsIgnoreCase("Mo")){
      if(kg<=5){
        valor = 2.5*kg;
      }else if (kg>5){
        valor = 2.2*kg;
      } 
    } 
   System.out.println("A compra ficou R$"+valor+"\n");
   if (valor>25 || kg>8){
    System.out.println("Você recebeu um desconto de 20%");
    System.out.println("Sua compra ficou R$"+(valor*0.8));
   } 
  }
}

