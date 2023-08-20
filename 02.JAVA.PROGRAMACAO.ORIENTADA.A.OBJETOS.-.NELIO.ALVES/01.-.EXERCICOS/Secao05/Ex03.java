package secao5;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite 2 valores em ordem crescente");
        System.out.printf("1º valor: ");
        n1 = sc.nextInt();
        System.out.printf("2º valor: ");
        n2 = sc.nextInt();
        if (n1%n2==0 || n2%n1==0){
            System.out.printf("Os valores são multiplos");
        } else {
            System.out.printf("Os valores não são multiplos");
        }
    }
}
