package aula15;

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p1, p2, p3;
        System.out.println("Comparador de preços");
        System.out.printf("Valor do 1º produto R$:");
        p1 = sc.nextDouble();
        System.out.printf("Valor do 2º produto R$:");
        p2 = sc.nextDouble();
        System.out.printf("Valor do 3º produto R$:");
        p3 = sc.nextDouble();
        if (p1<p2&&p1<p3){
            System.out.printf("Você deve comprar o 1º produto de R$:%.2f", p1);
        } else if (p2<p1&&p2<p3) {
            System.out.printf("Você deve comprar o 2º produto de R$:%.2f", p2);
        } else if (p3<p1&&p3<p2) {
            System.out.printf("Você deve comprar o 3º produto de R$:%.2f", p3);
        }
    }
}
