package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quantos Clientes: ");
    int qtd = sc.nextInt();
double totRend = 0, totValor = 0, tot;
    for (int i = 1; i <=qtd ; i++) {
      double valor = rand.nextDouble(3000)+1000;
      int tipo = rand.nextInt(3)+1;
      double juro = (tipo==1)?0.015:(tipo==2)?0.02:0.04;
      int mes = rand.nextInt(36)+1;
      double rend=0;
      for (int j = 1; j <=mes; j++) {
        rend = rend+(valor*juro);
      }
      double capital = rend+valor;
      totValor += valor;
      totRend+=rend;

      System.out.println("Cliente "+i+"\tR$"+df.format(valor)+"\t\" " +
              tipo+" \"\t\" "+(juro*100)+"% \"\t\" "+mes+" \"\tR$"+df.format(rend)+"\tR$"+df.format(capital));

    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("totRend = " + totRend);
    System.out.println("totValor = " + totValor);
    System.out.println();
    System.out.println();
    System.out.println(totValor + totRend);
  }
}
