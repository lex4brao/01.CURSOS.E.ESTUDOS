package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex70 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");
    
    int resp=1, qtd=0; 
    double pedido=0, total=0;

    System.out.print("Lanchonete - X-Tera");
    System.out.println("\t\tCardapio");
    System.out.println("Produto\t\tCodigo\tValor");
    System.out.println("Hot Dog\t\t100\tR$1,20");
    System.out.println("Bauru\t\t101\tR$1,30");
    System.out.println("Bauru c/ ovo\t102\tR$1,50");
    System.out.println("Hamburquer\t103\tR$1,20");
    System.out.println("Cheeseburguer\t104\tR$1,30");
    System.out.println("Refrigerante\t105\tR$1,00");
    do {
      System.out.println("\nDigite o código do pedido");
      System.out.println("Digite 0 para encerrar");
      System.out.print(">>>");
      resp = scan.nextInt();
      if(resp==0){
        break;
      }
      switch(resp){
        case 100: 
          pedido = 1.2; 
        break;
        case 101: 
          pedido = 1.3; 
        break;
        case 102: 
          pedido = 1.5; 
        break;
        case 103: 
          pedido = 1.2; 
        break;
        case 104: 
          pedido = 1.3; 
        break;
        case 105: 
          pedido = 1; 
        break;
        default: 
          System.out.println("Código inválido"); 
          pedido=0;
        break;
      } 
      System.out.println("Qual a quantidade:");
      System.out.print(">>>");
      qtd = scan.nextInt();
      pedido = pedido*qtd;
      total+=pedido;
    } while(resp!=0);
    System.out.println("Pedido Finalizado");
    if (total!=0){
      System.out.println("O valor do pedido é R$"+total);
    } 

  }
}
 
 
 