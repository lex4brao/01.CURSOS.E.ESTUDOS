package secao6;

import java.util.Scanner;
public class L2Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, fim, x=0, in=0, out=0;
        System.out.println("Digite quantos valores deseja cadastrar");
        System.out.printf(">>");
        fim = sc.nextInt();
        for(i=0;i<fim;i++){
            System.out.printf("Valor "+(i+1)+": ");
            x= sc.nextInt();
            if (x>=10 &&x<=20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println();
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
