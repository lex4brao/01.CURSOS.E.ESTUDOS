package aula19;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random random= new Random();
        int[] vetA = new int[8];
        int[] vetB = new int[8];
        for (int i=0;i< vetA.length;i++){
            vetA[i] = random.nextInt(100);
            vetB[i] = (vetA[i]*2);
        }
        System.out.println("Vetor A");
        for (int i=0;i< vetA.length;i++){
            System.out.printf("["+i+"]: "+vetA[i]+" ");
        }
        System.out.println("\nVetor B");
        for (int i=0;i< vetB.length;i++){
            System.out.printf("["+i+"]: "+vetB[i]+" ");
        }
    }
}
