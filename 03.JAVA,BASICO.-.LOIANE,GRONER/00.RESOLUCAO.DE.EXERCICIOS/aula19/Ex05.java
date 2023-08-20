package aula19;

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random random= new Random();
        double[] vetA = new double[10];
        double[] vetB = new double[10];
        for (int i=0;i< vetA.length;i++){
            vetA[i] = random.nextInt(100);
            vetB[i] = (vetA[i]*i);
        }
        System.out.println("Vetor A");
        for (int i=0;i< vetA.length;i++){
            System.out.printf("["+i+"]: "+vetA[i]+" ");
        }
        System.out.println("\nVetor B");
        for (int i=0;i< vetB.length;i++){
            System.out.printf("["+i+"]: %.2f",vetB[i]);
        }
    }
}
