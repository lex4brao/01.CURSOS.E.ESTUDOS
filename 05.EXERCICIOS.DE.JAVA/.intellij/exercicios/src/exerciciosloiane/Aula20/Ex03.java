package exerciciosloiane.Aula20;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] mat = new int[3][3];
    int qtP = 0, qtI = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print("[" + i + "][" + j + "]: ");
        mat[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < mat.length; i++) {
      System.out.print("\n");
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + "  ");
        if (mat[i][j] % 2 == 0) {
          qtP++;
        } else {
          qtI++;
        }
      }
    }
      System.out.println();
      System.out.println("Foram encontrados "+qtP+" numeros pares");
      System.out.println("Foram encontrados "+qtI+" numeros impares");
  }
}