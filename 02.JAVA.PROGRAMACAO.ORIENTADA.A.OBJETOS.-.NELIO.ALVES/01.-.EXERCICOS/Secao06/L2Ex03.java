package secao6;

import java.util.Scanner;
public class L2Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1, i2, fim;
        double soma, x=0, med;
        System.out.println("Quantas médias deseja fazer");
        System.out.printf(">>");
        fim = sc.nextInt();
        for (i1=0;i1<fim;i1++){
            med=0;
            soma=0;
            for (i2=1;i2<=3;i2++){
                System.out.printf("Valor "+i2+": ");
                x= sc.nextDouble();
                soma+=x;
            }
            med = soma/3;
            System.out.println("Média "+(+i1+1)+": "+med);
        }
    }
}
