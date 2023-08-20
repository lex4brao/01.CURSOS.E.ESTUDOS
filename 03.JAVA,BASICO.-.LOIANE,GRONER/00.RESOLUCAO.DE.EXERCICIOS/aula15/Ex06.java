package aula15;

import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite 3 numeros");
        System.out.printf("1º: ");
        n1 = sc.nextInt();
        System.out.printf("1º: ");
        n2 = sc.nextInt();
        System.out.printf("1º: ");
        n3 = sc.nextInt();
        if (n1>n2&&n1>n3){
            System.out.println("O numero "+n1+" é o maior");
        } else if (n2>n1&&n2>n3) {
            System.out.println("O numero "+n2+" é o maior");
        } else if (n3>n1&&n3>n2) {
            System.out.println("O numero "+n3+" é o maior");
        }

    }
}
