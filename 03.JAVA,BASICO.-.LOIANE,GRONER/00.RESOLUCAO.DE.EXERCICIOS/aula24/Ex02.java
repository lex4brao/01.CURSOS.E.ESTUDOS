package aula24;

import aula24.ex02.Livro;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Livro livro=new Livro();
        System.out.print("Titulo: ");
        livro.titulo = sc.nextLine();
        System.out.print("Autor: ");
        livro.autor = sc.nextLine();
        System.out.print("Ano de lançamento: ");
        livro.anoLancamento = sc.nextInt();
        System.out.print("Numero de paginas: ");
        livro.numeroPaginas = sc.nextInt();

        System.out.println();
        System.out.println(livro);
    }
}
