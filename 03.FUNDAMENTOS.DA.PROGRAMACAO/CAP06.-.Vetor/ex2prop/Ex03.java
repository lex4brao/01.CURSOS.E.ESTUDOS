package CAP06.ex2prop;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] codigosProdutos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] valorProdutos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] estoqueProdutos = {20, 15, 30, 25, 10, 5, 12, 18, 22, 10};
    while (true) {
      System.out.println("Digite o código do cliente \"###\": ");
      System.out.println("Para sair digite 0 para sair");
      System.out.print(">>");
      int cod = sc.nextInt();
      if (cod==0){
        break;
      }
      System.out.println("Digite o código do produto: ");
      int codP = sc.nextInt();
      int busc =-1, cont=0;
      for(int codigo:codigosProdutos){
        busc =(codigo==codP)?cont:busc;
        cont++;
      }
      if (busc==-1){
        System.out.println("Código inexistente\n\n\n");
        continue;
      }
      System.out.println("Digite a quantidade: ");
      int qtd = sc.nextInt();
      if (qtd>estoqueProdutos[busc]){
        System.out.println("Não há essa quantidade em estoque\n\n\n");
        continue;
      }
      int saldo= valorProdutos[busc]*qtd;
      System.out.println("Valor: R$"+saldo);
      System.out.println();
      System.out.println();

    }
  }
}
