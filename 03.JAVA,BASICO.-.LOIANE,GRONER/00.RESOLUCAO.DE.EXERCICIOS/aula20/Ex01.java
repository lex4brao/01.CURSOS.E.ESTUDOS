package aula20;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        double[][] mat = new double[4][4];
        double maior=0;
        int maiori=0, maiorj=0;
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                mat[i][j]= random.nextDouble(10)+Math.random();
                if (i==0 && j==0){
                    maior = mat[i][j];
                } else if (mat[i][j]>maior) {
                    maior = mat[i][j];
                    maiori = i;
                    maiorj = j;
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
        System.out.println("O maior numero da matriz é: ");
        System.out.println("["+maiori+"]["+maiorj+"]:"+df.format(maior));
    }
}
