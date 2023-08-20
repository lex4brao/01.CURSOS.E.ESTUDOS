package secao6;

import java.util.Scanner;
public class L2Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, x;
        System.out.println("Contagem de impares");
        System.out.printf("Digite o valor do final da contagem: ");
        x= sc.nextInt();
        for (i=0;i<=x;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
