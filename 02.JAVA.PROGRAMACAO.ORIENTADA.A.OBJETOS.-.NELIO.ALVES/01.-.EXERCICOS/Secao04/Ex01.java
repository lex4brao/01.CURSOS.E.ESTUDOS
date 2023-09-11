package secao04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite um numero inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        n2 = sc.nextInt();
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
    }
}
