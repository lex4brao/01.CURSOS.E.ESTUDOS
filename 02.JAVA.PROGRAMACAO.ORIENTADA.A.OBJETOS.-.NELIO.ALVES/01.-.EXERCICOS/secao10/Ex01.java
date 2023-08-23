package secao10;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Quantos numeros deseja digitar: ");
        n= sc.nextInt();
        int[] numeros = new int[n];
        for (int i=0;i<numeros.length;i++){
            System.out.print("["+(i+1)+"]: ");
            numeros[i]= sc.nextInt();
        }
        System.out.println("Os numeros negativos digitados é: ");
        for(int numero : numeros){
            if (numero<0){
                System.out.println(numero);
            }
        }
    }
}
