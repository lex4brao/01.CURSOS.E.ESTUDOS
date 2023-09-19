package secao10;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros deseja cadastrar: ");
        int n= sc.nextInt();
        int[] vet = new int[n];
        for (int i=0; i< vet.length;i++){
            System.out.print("["+i+"]: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Você digitou os seguintes numeros pares: ");
        for (int i=0; i< vet.length;i++){
            if (vet[i]%2==0){
                System.out.print(vet[i]+" ");
            }
        }
    }
}
