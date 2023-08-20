package aula19;

import java.util.Random;

public class Ex16 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[10];
        int menor15=0, igual15=0, maior15=0;
        for (int i=0;i< vet.length;i++){
            vet[i]= random.nextInt(100);
            if (vet[i]<15){
                menor15+=vet[i];
            } else if (vet[i]==15) {
                igual15++;
            } else if (vet[i]>15) {
                maior15+=vet[i];
            }
            System.out.printf("["+i+"]:"+vet[i]+"  ");
        }
        System.out.println("\nA soma dos elementos menor que 15 é "+menor15);
        System.out.println("Em "+igual15+" posições está o numero 15");
        System.out.println("A média dos valores maiores que 15 é "+(maior15/ vet.length));
    }
}
