package secao10;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros deseja cadastrar: ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        int qtdPares=0, somaPares=0;
        double medPares;
        for (int i=0; i< vet.length; i++){
            System.out.print("["+i+"]: ");
            vet[i] = sc.nextInt();
            if (vet[i]%2==0){
                qtdPares++;
                somaPares += vet[i];
            }
        }
        if (qtdPares==0){
            System.out.println("Nenhum numero par foi digitado");
        } else {
            medPares = (double) somaPares/qtdPares;
            System.out.println("A média dos numeros pares digitados é "+medPares);
        }
    }
}
