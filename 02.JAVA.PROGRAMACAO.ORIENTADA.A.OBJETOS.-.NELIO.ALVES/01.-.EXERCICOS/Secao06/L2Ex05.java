package secao6;

import java.util.Scanner;
public class L2Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fat, i, n;
        System.out.printf("Digite o numero de deseja fatorar: ");
        n= sc.nextInt();
        fat=1;
        for (i=1; i<=n;i++){
            fat*=i;
        }
        System.out.println(n+" =! "+fat);

    }
}
