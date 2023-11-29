package CAP05.ex2prop;

import java.util.Random;

public class Ex01 {
  public static void main(String[] args) {
    Random rand = new Random();
    int valor1 = rand.nextInt(100)+1;
    int valor2 = rand.nextInt(100)+1;
    int valor3 = rand.nextInt(100)+1;
    int valor4 = rand.nextInt(100)+1;
    System.out.println(valor1+" "+valor2+" "+valor3+" "+valor4);
    int[] valores = {valor1, valor2, valor3, valor4};

    for (int i = 0; i < valores.length - 1; i++) {
      for (int j = 0; j < valores.length - i - 1; j++) {
        if (valores[j] > valores[j + 1]) {
          int temp = valores[j];
          valores[j] = valores[j + 1];
          valores[j + 1] = temp;
        }
      }
    }

    System.out.println("Valores ordenados: ");
    for (int valor : valores) {
      System.out.println(valor);
    }

  }
}
