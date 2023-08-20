package secao4;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2, soma;
        System.out.println("Soma de dois numeros");
        System.out.printf("Digite um numero ");
        n1 = sc.nextInt();
        System.out.printf("Digite outro numero ");
        n2 = sc.nextInt();
        soma = n1+n2;
        System.out.println(n1+"+"+n2+"="+soma);
    }
}
