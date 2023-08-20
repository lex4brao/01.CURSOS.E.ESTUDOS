package aula15;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1, n2;
        System.out.printf("1º Valor = ");
        n1 = sc.nextInt();
        System.out.printf("2º Valor = ");
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("menor valor"+n2);
        } else {
            System.out.println("menor valor"+n1);
        }

    }
}
