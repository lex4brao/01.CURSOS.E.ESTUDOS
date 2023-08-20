package secao6;

import java.util.Scanner;
public class L2Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, x;
        System.out.printf("Digite um valor: ");
        x = sc.nextInt();
        for (i=1;i<=x;i++){
            if (x%i==0){
                System.out.println(i);
            }
        }
    }
}
