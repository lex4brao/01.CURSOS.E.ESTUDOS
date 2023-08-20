package aula19;

import java.util.Random;

public class Ex22 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        for (int i=0;i< vet.length;i++){
            do {
                vet[i]= random.nextInt(100);
            }while (vet[i]%2!=0);
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf(vet[i]+" ");
        }
    }
}
