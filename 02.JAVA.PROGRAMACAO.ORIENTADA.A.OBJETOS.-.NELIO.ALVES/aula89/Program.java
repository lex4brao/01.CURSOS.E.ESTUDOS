package aula89;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String nome;
        double preco, soma=0;
        System.out.print("Quandos protudos deseja cadastrar: ");
        n = sc.nextInt();
        Produto[] prod = new Produto[n];

        for (int i=0; i< prod.length;i++){
            sc.nextLine();
            System.out.print("Nome: ");
            nome=sc.nextLine();
            System.out.print("Preço R$:");
            preco=sc.nextDouble();
            System.out.println();
            prod[i] = new Produto(nome, preco);
            soma+=prod[i].getPreco();
        }
        System.out.println("Valor total R$"+soma);
    }
}
