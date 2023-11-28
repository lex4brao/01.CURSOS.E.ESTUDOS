package CAP06.ex1resolv;

import java.util.Random;
import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] cod = new int[12];
    String[] orig = new String[12];
    String[] dest = new String[12];
    int[] vagas = new int[12];

//preenchendo vetores
    cod = vetorCod(cod);
    orig = vetorOrig(orig);
    dest = vetorDest(dest);
    vagas = vetorVagas(vagas);

    int op = 0;
    while (op != 3) {

      System.out.println("Digite a opção desejada");
      System.out.println("[1] - Consultar voos");
      System.out.println("[2] - Efetuar Reserva");
      System.out.println("[3] - Sair");
      System.out.print(">> ");
      op = sc.nextInt();

      switch (op) {
        case 1:
          System.out.println("Lista dos voos");
          for (int i = 0; i < cod.length; i++) {
            System.out.printf("Cod %02d", cod[i]);
            System.out.printf("\t%-20s", orig[i]);
            System.out.printf("\t%-20s", dest[i]);
            System.out.printf("\t%02d%n", vagas[i]);
          }
          break;
        case 2:
          int resp;
          System.out.print("Digite o codigo do voo da reserva: ");
          resp = sc.nextInt();
          for (int i = 0; i < cod.length; i++) {
            if (resp == cod[i]) {
              resp = i;
            }
          }
          vagas[resp]--;
          System.out.printf("Cod %02d", cod[resp]);
          System.out.printf("\t%-20s", orig[resp]);
          System.out.printf("\t%-20s", dest[resp]);
          System.out.printf("\t%02d%n", vagas[resp]);
          break;
        default:
          System.out.println("Opção invalida");
          break;

      }
    }


  }

  private static int[] vetorVagas(int[] vagas) {
    Random rand = new Random();
    for (int i = 0; i < vagas.length; i++) {
      vagas[i] = rand.nextInt(50) + 1;
    }
    return vagas;
  }

  private static String[] vetorDest(String[] dest) {
    Random rand = new Random();
    for (int i = 0; i < dest.length; i++) {
      int aux = rand.nextInt(3);
      dest[i] = (aux == 1) ? "Londres" : (aux == 0) ? "New York" : "São Francisco";
    }
    return dest;
  }

  private static String[] vetorOrig(String[] orig) {
    Random rand = new Random();
    for (int i = 0; i < orig.length; i++) {
      int aux = rand.nextInt(3);
      orig[i] = (aux == 1) ? "São Paulo" : (aux == 0) ? "Rio de Janeiro" : "Brasilia ";
    }
    return orig;
  }

  private static int[] vetorCod(int[] cod) {
    for (int i = 0; i < cod.length; i++) {
      cod[i] = i + 1;
    }
    return cod;
  }
}
