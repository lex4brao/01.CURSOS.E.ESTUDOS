package secao05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite 2 numeros inteiros em ordem crescente: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1%n2==0){
            System.out.println(n1+" e "+n2+" são multiplos");
        } else {
            System.out.println(n1+" e "+n2+" não são multiplos");
        }
    }
}
