package secao08;

import secao08.ex04.Conversor;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double dollar, qtd;
         System.out.print("Qual a cotação do Dollar R$");
         dollar = sc.nextDouble();
         System.out.print("Quandos dolares deseja comprar: ");
         qtd = sc.nextDouble();
        System.out.printf("Você irá pagar R$%.2f", Conversor.Valor(dollar, qtd));
    }
}
