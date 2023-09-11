package secao05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();
        if (n%2==0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
