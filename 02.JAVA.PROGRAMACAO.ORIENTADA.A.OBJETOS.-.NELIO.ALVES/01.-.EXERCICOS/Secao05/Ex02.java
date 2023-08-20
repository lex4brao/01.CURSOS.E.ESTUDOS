package secao5;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        System.out.printf("Digite um numero inteiro: ");
        n1 = sc.nextInt();
        if (n1%2==0){
            System.out.printf("O numero é par");
        } else {
            System.out.printf("O numero é impar");
        }
    }
}
