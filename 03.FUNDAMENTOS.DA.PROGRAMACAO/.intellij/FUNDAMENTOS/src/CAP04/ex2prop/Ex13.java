package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o valor do produto R$");
    double valor = sc.nextDouble();
    if (valor<=50){
      valor = valor*1.05;
    } else if (valor<=100) {
      valor = valor*1.1;
    } else {
      valor = valor*1.15;
    }
    System.out.println("Sua compra ficou R$"+df.format(valor));
    if (valor<=80){
      System.out.println("Compra barata");
    } else if (valor<=120) {
      System.out.println("Compra normal");
    } else if (valor<=200) {
      System.out.println("Compra cara");
    } else {
      System.out.println("Compra muito cara");
    }
  }
}
