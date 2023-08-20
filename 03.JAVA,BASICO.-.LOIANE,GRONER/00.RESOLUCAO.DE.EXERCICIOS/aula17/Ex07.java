package aula17;

import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, x, maior=0;
        for (i=1;i<=5; i++){
            System.out.printf(i+"º Valor: ");
            x = sc.nextInt();
            if (i==1){
                maior = x;
            } if (x>maior){
                maior=x;
            }
        }
        System.out.println("O maior numero digitado é "+maior);
    }
}
