package aula19;

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        int qtPar=0;
        for (int i=0;i< vet.length;i++){
            vet[i]= random.nextInt(10);
            if (vet[i]%2==0){
                qtPar++;
            }
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf("["+i+"]: "+vet[i]+" ");
        }
        System.out.println("\nO vetor tem "+qtPar+" numeros pares");
    }
}
