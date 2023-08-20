package aula13;

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1, n2;
        double n3, a, b, c;
        System.out.printf("Digite um numero inteiro: ");
        n1 = sc.nextInt();
        System.out.printf("Digite outro numero inteiro: ");
        n2 = sc.nextInt();
        System.out.printf("Digite um numero real: ");
        n3 = sc.nextDouble();
        a = (n1*2)*(n2/2);
        System.out.println("A: "+a);
        b = (n1*3)+n3;
        System.out.println("B: "+b);
        c = Math.pow(n3,3);
        System.out.println("C: "+c);

    }
}
