package secao4;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int na, nb, nc, nd, dif;
        System.out.println("Diferenca dos produtos");
        System.out.printf("Digite o 1º numero: ");
        na = sc.nextInt();
        System.out.printf("Digite o 2º numero: ");
        nb = sc.nextInt();
        System.out.printf("Digite o 3º numero: ");
        nc = sc.nextInt();
        System.out.printf("Digite o 4º numero: ");
        nd = sc.nextInt();
        dif = (na*nb)-(nc*nd);
        System.out.println("A diferença é "+dif);

    }
}
