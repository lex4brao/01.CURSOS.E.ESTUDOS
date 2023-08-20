package aula13;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double mts;
        System.out.println("Conversor de metros para centimetro");
        System.out.println("Digite o valor que deseja converter");
        mts = sc.nextDouble();
        System.out.println();
        System.out.println(mts+" metros tem "+(mts*100)+"cm");
    }
}
