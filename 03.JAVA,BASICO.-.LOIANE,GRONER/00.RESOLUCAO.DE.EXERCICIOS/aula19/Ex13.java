package aula19;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        int m5=0;
        for (int i=0;i< vet.length;i++){
            vet[i]= random.nextInt(100);
            if (vet[i]%5==0){
                m5 += vet[i];
            }
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf("["+i+"]: "+vet[i]+" ");
        }
        System.out.println("\nA soma dos elementos multiplos de 5 é "+m5);
    }

}
