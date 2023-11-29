package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");
    System.out.print("\n\nDigite o valor da compra R$: ");
    double valor = scan.nextDouble();
    double juro = 0;
    double valorF = 0;
    double valorP = 0;
    for (int i = 6; i <=60; i+=6) {
        juro +=0.03;
        valorF = valor*(juro+1);
        valorP = valorF/i;
      System.out.println(i+"x de \tR$"+df.format(valorP)+"\tJuros "+df.format(juro*100)+"% \tTotal R$"+df.format(valorF));

    }

  }
}