package exerciciosloiane.Aula20;

import java.util.Random;

public class Ex01 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[][] nums = new int[4][4];
    int maio = 0;
    int linha = 0, colua=0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j <nums[i].length ; j++) {
        nums[i][j]= rand.nextInt(100);
        System.out.printf(nums[i][j]+"  ");
      }

      System.out.println();
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (maio<nums[i][j]){
          maio = nums[i][j];
          linha = i;
          colua = j;
        }
      }
    }
      System.out.println("O maior valor é "+maio+" na linha "+linha+" na coluna "+colua);
  }
}
