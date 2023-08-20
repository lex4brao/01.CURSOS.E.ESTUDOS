package aula20;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        double[][] mat = new double[10][10];
        double maior5=0, menor5=0, maior7=0, menor7=0;
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                mat[i][j]= random.nextDouble(10);
                if (i==5 && j==0){
                    maior5 = mat[i][j];
                    menor5 = mat[i][j];
                } else if (i==5 && mat[i][j]>maior5) {
                    maior5 = mat[i][j];
                } else if (i==5 && mat[i][j]<menor5) {
                    menor5 = mat[i][j];
                }
                if (i==7 && j==0){
                    maior7 = mat[i][j];
                    menor7 = mat[i][j];
                } else if (i==7 && mat[i][j]>maior7) {
                    maior7 = mat[i][j];
                } else if (i==7 && mat[i][j]<menor7) {
                    menor7 = mat[i][j];
                }
            }
        }
        System.out.println();
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                System.out.printf("["+i+"]["+j+"]:"+df.format(mat[i][j])+"\t\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Linha 5");
        System.out.println("Maior: "+df.format(maior5));
        System.out.println("Menor: "+df.format(menor5));
        System.out.println("Linha 7");
        System.out.println("Maior: "+df.format(maior7));
        System.out.println("Menor: "+df.format(menor7));
    }
}
