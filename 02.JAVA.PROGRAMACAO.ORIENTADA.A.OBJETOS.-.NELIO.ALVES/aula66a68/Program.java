package aula66a68;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Entre com os dados do produto");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.qtd = sc.nextInt();

        System.out.println(produto);

        int qtd;
        System.out.print("Digite a quantidade de produtos a ser adicionado ao estoque: ");
        qtd = sc.nextInt();
        produto.addProduto(qtd);
        System.out.println(produto);

        System.out.print("Digite a quantidade de produtos a ser removido do estoque: ");
        qtd = sc.nextInt();
        produto.removeProduto(qtd);
        System.out.println(produto);

    }
}
