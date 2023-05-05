package Aula14;
import java.util.Scanner;

class IfElse2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do produto R$:");
    double valor = scan.nextDouble();

    if((valor<=10)&&(valor<15)){
      System.out.println("O produto está barato");
    } else if ((valor>=15)&&(valor<17)){
      System.out.println("Pedir desconto");
    } else if ((valor>=17)&&(valor<20)){
      System.out.println("Pesquisar melhor preço");
    } else {
      System.out.println("Produto muito caro");
    }

  }
}