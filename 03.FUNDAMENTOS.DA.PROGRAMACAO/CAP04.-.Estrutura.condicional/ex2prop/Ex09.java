package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Digite sua renda mensal R$");
    double renda = sc.nextDouble();
    double credito = 0;
    if (renda<=500){
      System.out.println("Não temos crédito disponivel");
    } else if (renda<=1000) {
      credito = renda*0.1;
      System.out.println("Temos um crédito de R$"+credito);
    } else if (renda<=3000) {
      credito = renda*0.2;
      System.out.println("Temos um crédito de R$"+credito);
    } else if (renda<=4000) {
      credito = renda*0.25;
      System.out.println("Temos um crédito de R$"+credito);
    } else if (renda>4000) {
      credito = renda*0.3;
      System.out.println("Temos um crédito de R$"+credito);
    }
  }
}
