package CAP07.ex1resolv;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int[][] mat = new int[10][20];
    int[] vet = new int[10];
    int soma=0;
    System.out.println("Matriz");
    for (int i = 0; i <mat.length ; i++) {
        for (int j = 0; j <mat[i].length ; j++) {
            mat[i][j] = rand.nextInt(10)+1;
            soma +=mat[i][j];
            System.out.printf("\t"+mat[i][j]);
        }
        System.out.println();
        vet[i]= soma;
    }
    System.out.println();
    System.out.println("Vetor");
    for (int valor : vet){
        System.out.print("\t"+valor);
    }
    System.out.println();
    System.out.println("Matriz multiplicada");
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            mat[i][j] = mat[i][j]*vet[i];
            System.out.printf("\t%-4d",mat[i][j]);
        }
        System.out.println();
    }
}
}
