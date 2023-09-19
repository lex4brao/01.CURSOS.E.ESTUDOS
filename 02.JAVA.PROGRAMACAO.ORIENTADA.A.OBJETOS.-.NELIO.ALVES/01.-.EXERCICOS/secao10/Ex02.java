package secao10;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Quantos numeros deseja digitar: ");
        n = sc.nextInt();
        int[] vet = new int[n];
        for (int i=0; i< vet.length;i++){
            System.out.print("["+i+"]: ");
            vet[i]= sc.nextInt();
        }
        int soma=0;
        System.out.print("Você digitou os valores: ");
        for (int i=0; i< vet.length;i++){
            System.out.print(vet[i]+" ");
            soma += vet[i];
        }
        System.out.println();
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A média dos valores é: "+(soma/ vet.length));

    }
}
