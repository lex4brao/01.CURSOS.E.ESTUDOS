package aula17;

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, soma=0, med;
        for(int i=1;i<=5;i++){
            System.out.printf(i+"º Valor: ");
            x= sc.nextInt();
            soma+=x;
        }
        med=soma/5;
        System.out.println("A média dos numeros é "+med);
    }
}
