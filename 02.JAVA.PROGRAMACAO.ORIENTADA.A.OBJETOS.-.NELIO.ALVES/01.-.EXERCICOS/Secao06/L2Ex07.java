package secao6;

import java.util.Scanner;
public class L2Ex07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, x;
        System.out.printf("Digite o numero de linhas:  ");
        x= sc.nextInt();
        for (i=1;i<=x;i++){
            System.out.println(i+" "+Math.pow(i,2)+" "+Math.pow(i,3));
        }
    }
}
