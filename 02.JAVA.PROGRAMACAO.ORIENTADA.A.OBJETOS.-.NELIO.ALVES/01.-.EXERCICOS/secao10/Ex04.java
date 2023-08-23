package secao10;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, qtd=0;
        System.out.print("Quantos numeros deseja cadastrar: ");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for(int i=0;i<numeros.length;i++){
            System.out.print("["+(i+1)+"]: ");
            numeros[i]=sc.nextInt();
            if (numeros[i]%2==0){
                qtd++;
            }
        }
        System.out.println();
        System.out.println("Foram cadastrados "+qtd+" numeros pares: ");
        for (int numero:numeros) {
            if (numero%2==0){
                System.out.print(numero+"  ");
            }
        }


    }
}
