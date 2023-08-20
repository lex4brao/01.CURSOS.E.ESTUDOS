package aula19;

import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        int soma=0;
        double med;
        for (int i=0;i< vet.length;i++){
            vet[i]= random.nextInt(10);
            soma += vet[i];
        }
        for (int i=0;i< vet.length;i++){
            System.out.printf("["+i+"]: "+vet[i]+" ");
        }
        med = (soma/ vet.length);
        System.out.println("\nA média dos elementos é "+med);
    }
}
