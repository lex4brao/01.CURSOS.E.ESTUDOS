package exerciciosloiane.Aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");

    String resp;
    double valorProduto;
    double valorCompra;
    double pagamento;
    int cont;

    do {
      cont = 1;
      valorCompra =0;

      System.out.println("\n***** CAIXA REGISTRADORA *****");
      System.out.print("Digite 0 para sair");


      do {
        System.out.print("Valor Produto "+cont+": ");
        valorProduto = sc.nextDouble();
        valorCompra+=valorProduto;
        cont++;

      } while (valorProduto!=0);

      System.out.println();
      System.out.println();
      System.out.println("Valor da comprar é R$"+df.format(valorCompra));
      System.out.print("Dinheiro recebido R$: ");
      pagamento = sc.nextDouble();
      System.out.println("O troco é R$"+(pagamento-valorCompra));

      System.out.println();
      System.out.print("Deseja Continuar [S]im ou [N]ão:  ");
      resp = sc.next();
      System.out.println();
      System.out.println();

    } while (!resp.equalsIgnoreCase("n"));
    System.out.println("Obrigado volte sempre");

  }
}
