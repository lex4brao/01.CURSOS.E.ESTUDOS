package secao10;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, soma=0;
        System.out.print("Quantos numeros deseja digitar: ");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i=0;i<numeros.length;i++){
            System.out.print("["+(i+1)+"]: ");
            numeros[i]= sc.nextInt();
            soma+=numeros[i];
        }
        System.out.print("Valores: ");
        for (int numero : numeros){
            System.out.print(numero+"  ");
        }
        System.out.println("\nA soma dos valores é "+soma);
        System.out.println("A média dos valores é "+(soma/numeros.length));
    }
}
