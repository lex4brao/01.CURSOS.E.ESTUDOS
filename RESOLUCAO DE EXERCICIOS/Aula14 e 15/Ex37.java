package Aula15;

import java.util.Scanner;

class Ex37 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    double valor=0;
    System.out.println("Açoge Boi Ferdinando");
    System.out.println("Escolha a opção desejada");
    System.out.println("[1] - Filé Duplo");
    System.out.println("\tAté 5kg R$4.90/kg");  
    System.out.println("\tAcima 5kg R$5.80/kg");  
    System.out.println("[2] - Alcatra");
    System.out.println("\tAté 5kg R$5.90/kg");  
    System.out.println("\tAcima 5kg R$6.80/kg");  
    System.out.println("[3] - Picanha");
    System.out.println("\tAté 5kg R$6.90/kg");  
    System.out.println("\tAcima 5kg R$7.80/kg");
    System.out.println("Digite a opção da carne desejada");  
    System.out.print(">>  ");  
    int resp = scan.nextInt();
    System.out.println("\nQuantos Kg deseja comprar");
    System.out.print(">> ");
    double kg = scan.nextInt();
    switch(resp){
      case 1: System.out.println("\n"+kg+"kg de Filé Duplo ");
      if (kg<=5){
        valor=kg*4.9;
      } else if (kg>5){
        valor=kg*5.8;
      } break; 
      case 2: System.out.println("\n"+kg+"kg de Alcatra ");
      if (kg<=5){
        valor=kg*5.9;
      } else if (kg>5){
        valor=kg*6.8;
      }  break;
      case 3: System.out.println("\n"+kg+"kg de Picanha"); 
      if (kg<=5){
        valor=kg*6.9;
      } else if (kg>5){
        valor=kg*9.8;
      }  break;
      default : System.out.println("Opção Inválida");
    }
    
    System.out.println("\nDeseja parar como:");
    System.out.println("[1] - Dinheiro");
    System.out.println("[2] - Cartão");
    System.out.print("Digite sua opção>>   "); 
    resp = scan.nextInt();
    switch(resp){
      case 1: System.out.println("Valor total R$"+valor);
        break;
      case 2: System.out.println("Valor total R$"+valor);
        System.out.println("Você obteve  desconto 5% no valor de R$"+(valor*0.05));
        System.out.println("Sua compra com desconto ficou no total R$"+(valor*0.95));
         break;
    }
  }
}

