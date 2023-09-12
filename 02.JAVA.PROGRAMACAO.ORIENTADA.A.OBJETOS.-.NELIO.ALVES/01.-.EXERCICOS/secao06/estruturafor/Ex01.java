package secao06.estruturafor;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.print("Digite um numero: ");
        numb = sc.nextInt();
        System.out.println("O numeros impares de 0 até "+numb+" são: ");
        for (int i=0;i<=numb;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
