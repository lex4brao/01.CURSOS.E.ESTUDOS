package secao10;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros deseja cadastrar: ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        int soma=0;
        double med;
        for (int i=0; i< vet.length; i++){
            System.out.print("["+i+"]: ");
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        med = (double) soma /vet.length;
        System.out.println("A média dos valores do vetor é "+med);
        System.out.println("O valores abaixo da média são: ");
        for (int i=0; i< vet.length; i++){
            if (vet[i]<med){
                System.out.println(vet[i]);
            }
        }
    }
}
