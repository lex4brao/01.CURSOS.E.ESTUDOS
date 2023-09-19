package secao10;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quandos numeros terá cada vetor: ");
        int n = sc.nextInt();
        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];
        System.out.println("Digite os numeros do vetor A: ");
        for (int i=0; i< vetA.length; i++){
            System.out.print("["+i+"]: ");
            vetA[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Digite os numeros do vetor B: ");
        for (int i=0; i< vetB.length; i++){
            System.out.print("["+i+"]: ");
            vetB[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Vetor resultante");
        for (int i=0; i< vetB.length; i++){
            vetC[i] = vetA[i]+vetB[i];
            System.out.println("["+i+"]: "+vetC[i]);
        }

    }
}
