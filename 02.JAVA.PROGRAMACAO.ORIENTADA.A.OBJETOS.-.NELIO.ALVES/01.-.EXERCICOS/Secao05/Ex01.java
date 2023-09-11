package secao05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();
        if (n>0){
            System.out.println("O numero é positivo");
        } else if (n<0){
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é nulo");
        }
    }
}
