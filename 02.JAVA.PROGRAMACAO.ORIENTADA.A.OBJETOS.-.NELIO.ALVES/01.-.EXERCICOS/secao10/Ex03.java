package secao10;

import secao10.ex03.Pessoa;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, idade;
        String nome;
        double altura, somaAltura=0;
        System.out.print("Quantas pessoas deseja cadastrar: ");
        n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];

        for (int i=0;i< pessoa.length;i++){
            sc.nextLine();
            System.out.println("Pessoa "+(i+1));
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            System.out.println();
            pessoa[i] = new Pessoa(nome, idade, altura);
            somaAltura += pessoa[i].getAltura();
        }
        System.out.println();
        System.out.println("A média das Alturas é "+(somaAltura/pessoa.length));
    }
}
