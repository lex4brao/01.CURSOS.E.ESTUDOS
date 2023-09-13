package secao08;

import secao08.ex01.Retangulo;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com os dados do triangulo: ");
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Comprimento: ");
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);
    }
}
