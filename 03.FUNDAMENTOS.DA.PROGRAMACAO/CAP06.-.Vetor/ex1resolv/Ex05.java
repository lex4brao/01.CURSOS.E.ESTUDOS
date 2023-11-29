package CAP06.ex1resolv;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();
    int[] vetX = new int[qtd];
    int[] vetY = new int[qtd];

    for (int i = 0; i < vetX.length; i++) {
      vetX[i] = rand.nextInt(10) + 1;
      vetY[i] = rand.nextInt(10) + 1;
    }

// união
    int[] uniao = new int[vetX.length + vetY.length];

    int pos = 0;
    for (int i = 0; i < vetX.length; i++) {
      boolean contem = false;
      for (int valor : uniao) {
        if (vetX[i] == valor) {
          contem = true;
          break;
        }
      }
      if (!contem) {
        uniao[pos] = vetX[i];
        pos++;
      }
    }

    for (int i = 0; i < vetY.length; i++) {
      boolean contem = false;
      for (int valor : uniao) {
        if (vetY[i] == valor) {
          contem = true;
          break;
        }
      }
      if (!contem) {
        uniao[pos] = vetY[i];
        pos++;
      }
    }

// diferença
    int[] dif = new int[vetX.length];
    pos = 0;

    for (int i = 0; i < vetX.length; i++) {
      boolean contem = false;
      for (int valor : vetY) {
        if (vetX[i] == valor) {
          contem = true;
          break;
        }
      }
      if (!contem) {
        for (int valor : dif) {
          if (vetX[i] == valor) {
            contem = true;
            break;
          }
        }
        if (!contem) {
          dif[pos] = vetX[i];
          pos++;
        }
      }
    }

// somaXY
    int[] somaXY = new int[vetX.length];

    for (int i = 0; i < vetX.length; i++) {
      somaXY[i] = vetX[i] + vetY[i];
    }

// ProdutoXY
    int[] produtoXY = new int[vetX.length];

    for (int i = 0; i < vetX.length; i++) {
      produtoXY[i] = vetX[i] * vetY[i];
    }

//inter
    int[] inter = new int[vetX.length];
    pos = 0;
    for (int i = 0; i < inter.length; i++) {
      boolean contem = false;
      for (int valor : vetY) {
        if (vetX[i] == valor) {
          contem = true;
          break;
        }

      }
      if (contem) {
        contem = false;
        for (int valor : inter) {
          if (vetX[i] == valor) {
            contem = true;
            break;
          }
        }
        if (!contem) {
          inter[pos] = vetX[i];
          pos++;
        }
      }
    }
    Arrays.sort(vetX);
    Arrays.sort(vetY);
    Arrays.sort(uniao);
    Arrays.sort(dif);
    Arrays.sort(somaXY);
    Arrays.sort(produtoXY);
    Arrays.sort(inter);

    System.out.println("Vetor X: " + Arrays.toString(vetX) + "\n");
    System.out.println("Vetor Y: " + Arrays.toString(vetY) + "\n");
    System.out.print("União: [");
    pos=0;
    for (int valor : uniao) {
      if (valor != 0) {
        if (pos==0) {
          System.out.print(valor);
          pos++;
        } else {
          System.out.print(", " + valor);

        }
      }
    }
    System.out.print("]\n\n");
    System.out.print("Diferença: [");
    pos=0;
    for (int valor : dif) {
      if (valor != 0) {
        if (pos==0) {
          System.out.print(valor);
          pos++;
        } else {
          System.out.print(", " + valor);

        }
      }
    }
    System.out.print("]\n\n");
    System.out.println("Soma de X+Y: " + Arrays.toString(somaXY) + "\n");
    System.out.println("Produto de X+Y: " + Arrays.toString(produtoXY) + "\n");
    System.out.print("Interceção X e Y: [");
    pos=0;
    for (int valor : inter) {
      if (valor != 0) {
        if (pos==0) {
          System.out.print(valor);
          pos++;
        } else {
          System.out.print(", " + valor);

        }
      }
    }
    System.out.print("]\n\n");

  }
}
