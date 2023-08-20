package aula19;

import java.util.Random;

public class Ex21 {
    public static void main(String[] args) {
        Random random = new Random();
        long[] vet = new long[10];
        int qt0=0, qt1=0;
        for (int i=0;i< vet.length;i++){
            vet[i] = Math.round(Math.random()*1);
            if (vet[i]==0){
                qt0++;
            }else {
                qt1++;
            }
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf(vet[i]+" ");
        }
        System.out.println("\n"+((qt0*100)/vet.length)+"% do vetor é 0");
        System.out.println(((qt1*100)/vet.length)+"% do vetor é 1");
    }
}
