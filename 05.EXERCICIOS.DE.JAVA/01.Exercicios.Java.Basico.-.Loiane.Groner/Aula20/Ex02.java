package exerciciosloiane.Aula20;

import java.util.Random;

public class Ex02 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[][] nums = new int[10][10];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j <nums[i].length ; j++) {
        nums[i][j]= rand.nextInt(100);
        System.out.printf("%2d  ",nums[i][j]);
      }
      System.out.println();
    }
    int menor = Integer.MAX_VALUE;
    for (int i = 0; i <nums[5].length ; i++) {
      menor = Math.min(menor,nums[5][i]);
    }
    int maior=0;
    for (int i = 0; i <nums.length ; i++) {
      maior = Math.max(maior,nums[i][7]);
    }
    System.out.println("O menor numero da linha 5 é "+menor);
    System.out.println("O maior numero da Coluna 7 é "+maior);
  }
}
