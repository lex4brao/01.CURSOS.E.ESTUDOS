package secao10;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros deseja cadastrar: ");
        int n = sc.nextInt();
        int maior=0, pos=0;
        int[] vet = new int[n];
        for (int i=0; i<vet.length;i++){
            System.out.print("["+i+"]: ");
            vet[i] = sc.nextInt();
        }
        for (int i=0; i<vet.length;i++){
            if (i==0){
                maior = vet[i];
            }
            if (maior<vet[i]){
                maior = vet[i];
                pos = i;
            }
        }
        System.out.println("O maior numero cadastrado é "+maior);
        System.out.println("Na posição "+pos);

    }
}
