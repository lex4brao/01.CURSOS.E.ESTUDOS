package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Digite o valor de fabrica do produto R$");
    double valorFab = sc.nextDouble();
    double valorC = 0;
    double dist = 0;
    double imp = 0;
    if (valorFab<12000){
      dist = valorFab*0.05;
      imp = 0;
    } else if (valorFab<25000) {
      dist = valorFab*0.1;
      imp = valorFab*0.15;
    } else if (valorFab>=25000) {
      dist = valorFab*0.15;
      imp = valorFab*0.2;
    }
    valorC = valorFab+dist+imp;
    System.out.println("O valor de venda é R$"+df.format(valorC));

  }
}
