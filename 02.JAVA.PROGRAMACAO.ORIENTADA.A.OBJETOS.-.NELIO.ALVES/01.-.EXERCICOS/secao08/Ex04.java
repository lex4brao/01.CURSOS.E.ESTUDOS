package secao8;

import secao8.ex04.Dollar;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.printf("Qual o valor do Dollar R$:");
        Dollar.dollar = sc.nextDouble();
        System.out.printf("Quandos dollares deseja comprar US$:");
        Dollar.compra = sc.nextDouble();
        System.out.println("US$:"+Dollar.compra+" ficam R$"+Dollar.Pagar());
    }
}
