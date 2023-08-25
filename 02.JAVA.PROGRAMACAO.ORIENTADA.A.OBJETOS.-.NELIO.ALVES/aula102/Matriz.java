package aula102;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int linha, coluna;
        System.out.print("Quantas linhas terá a matriz: ");
        linha = sc.nextInt();
        System.out.print("Quantas colunas terá a matriz: ");
        coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        System.out.println("Digite o um valor inteiro: ");
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("A Diagonal principal é");
        for (int i=0; i< matriz.length; i++){
            System.out.print(matriz[i][i]+" ");
        }
    }
}
