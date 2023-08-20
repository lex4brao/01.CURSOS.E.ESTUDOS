package secao8;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Estoque estoque=new Estoque();
        System.out.println("Entre com os dados do produto");
        System.out.printf("Nome: ");
        estoque.name = sc.nextLine();
        System.out.printf("Preço: ");
        estoque.valor = sc.nextDouble();
        System.out.printf("Quantidade: ");
        estoque.qtd = sc.nextDouble();

        System.out.println(estoque);

        int qtd;
        System.out.printf("Qual a quantida que deseja adicionar no estoque:");
        qtd = sc.nextInt();
        estoque.addProduto(qtd);

        System.out.println(estoque);

        System.out.printf("Qual a quantida que deseja remover no estoque:");
        qtd = sc.nextInt();
        estoque.delProduto(qtd);

        System.out.println(estoque);

    }
}
