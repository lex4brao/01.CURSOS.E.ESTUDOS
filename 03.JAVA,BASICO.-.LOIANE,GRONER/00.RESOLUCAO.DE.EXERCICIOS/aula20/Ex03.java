package aula20;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat = new int[3][3];
        int qtPar=0, qtImp=0;
        System.out.println("Preencha a Matriz");
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                System.out.printf("["+i+"]["+j+"]: ");
                mat[i][j] = sc.nextInt();
                if (mat[i][j]%2==0){
                    qtPar++;
                }else {
                    qtImp++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Voce digitou "+qtPar+" numeros pares");
        System.out.println("Voce digitou "+qtImp+" numeros impares");
    }
}
