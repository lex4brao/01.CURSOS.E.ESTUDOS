package CAP07.ex1resolv;

public class Ex01 {
  public static void main(String[] args) {
    int[][] matriz = {
            {5, 8},
            {3, 2}
    };
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println();
    }

    int maior = 0;
    for (int[] ints : matriz) {
      for (int j = 0; j < matriz[0].length; j++) {
        maior = Math.max(ints[j], maior);
      }
    }
    System.out.println("maior = " + maior);

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = matriz[i][j]*maior;
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println();
    }

  }
}
