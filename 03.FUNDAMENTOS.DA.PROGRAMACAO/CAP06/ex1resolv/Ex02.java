package CAP06.ex1resolv;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quantos produtos deseja cadastrar: ");
    int qtdP = sc.nextInt();
    double[] produtos = new double[qtdP];
    double[] valorVenda = new double[qtdP];
    int[] vendas = new int[qtdP];
    double maior = (int) Double.MIN_VALUE;
    for (int i = 0; i < produtos.length; i++) {
      produtos[i] = rand.nextDouble(48)+2;
      vendas[i] = rand.nextInt(15)+1;
      valorVenda[i] = produtos[i]*vendas[i];
      maior = Math.max(valorVenda[i], maior);
    }
    double totVendas = 0;
    double totComissão = 0;
    for (int i = 0; i < produtos.length; i++) {
      String produtoFormat = String.format("%-6s", "R$ "+df.format(produtos[i]));
      String vendasFormat = String.format("%-3s", "Qtd: "+vendas[i]);
      String valorFormat = String.format("%-10s", "R$:"+df.format(produtos[i]*vendas[i]));
      String comissaoFormat = String.format("%-6s", "R$:"+df.format((produtos[i]*vendas[i])*0.05));
      System.out.println("Produto "+i+"\t | "+produtoFormat+"\t | "+vendasFormat+"\t | "+valorFormat+"\t | "+comissaoFormat);

    totVendas += (produtos[i]*vendas[i]);
    totComissão+= ((produtos[i]*vendas[i])*0.05);
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Total das vendas R$"+df.format(totVendas));
    System.out.println("Total das comissão R$"+df.format(totComissão));
    System.out.println("Salario do funcionário R$"+df.format(550+totComissão));
    System.out.println();
    System.out.println();
    System.out.println("A maior venda foi: ");
    for (int i = 0; i <produtos.length ; i++) {
      if (maior==valorVenda[i]){

      System.out.println("Valor produto R$"+df.format(produtos[i]));
      System.out.println("Qtd: "+vendas[i]);
      System.out.println("Total: R$"+df.format(valorVenda[i]));
      }

    }


  }
}
