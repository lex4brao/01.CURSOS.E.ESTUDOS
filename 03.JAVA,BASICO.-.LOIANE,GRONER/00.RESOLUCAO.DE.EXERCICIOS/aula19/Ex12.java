package aula19;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        int soma=0;
        for (int i=0;i< vet.length;i++){
            vet[i]= random.nextInt(10);
            soma += vet[i];
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf("["+i+"]: "+vet[i]+" ");
        }
        System.out.println("\nA soma dos elementos é "+soma);
    }
}
