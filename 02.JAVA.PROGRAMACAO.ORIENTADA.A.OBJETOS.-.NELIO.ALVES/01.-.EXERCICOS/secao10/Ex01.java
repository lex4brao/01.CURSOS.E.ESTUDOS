package secao10;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.print("Digite quanto numeros deseja cadastrar: ");
        numb = sc.nextInt();
        int[] vet = new int[numb];
        for (int i=0;i< vet.length;i++){
            System.out.print("["+i+"]: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Você digitou os seguintes numeros negativos ");
        for (int i=0;i< vet.length;i++){
            if (vet[i]<0){
                System.out.print(vet[i] + " ");
            }
        }
    }
}
