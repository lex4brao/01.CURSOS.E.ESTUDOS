package CAP05.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quantos numeros deseja verificar: ");
    int qtd = sc.nextInt();
    int valor;
    int primo;
    int cont = 0;
    while (cont < qtd) {

      for (int i = 1; i <= qtd; i++) {
        primo = 0;
        valor = rand.nextInt(100) + 1;
//  valor = 11;
        for (int j = 1; j <= valor; j++) {
          primo = (valor % j == 0) ? (primo + 1) : primo;
        }
        if (primo <= 2) {

          System.out.print(i + "º Valor: " + valor);
          System.out.println((primo <= 2) ? " valor é primo\n" : " não é primo\n");
          cont++;
        }
      }
    }

  }
}
