package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("***** Parcelamento de Dividas ****");
    System.out.print("Digite o valor da divida R$: ");
    double divida = sc.nextDouble();
    double percJuro = 0;
    double divJuro;
    double valorParcela;
    for (int i = 3; i <= 48; i += 3) {
      percJuro += 0.05;
      divJuro = divida * (1 + percJuro);
      valorParcela = divJuro/i;
      System.out.println(i+ "x de R$"+df.format(valorParcela)+" | "+df.format((percJuro*100))+"% | Total R$"+df.format(divJuro));
    }
  }

}
