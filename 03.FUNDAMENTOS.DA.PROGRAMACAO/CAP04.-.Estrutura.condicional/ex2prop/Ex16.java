package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o preço do produto R$");
    double preco = sc.nextDouble();
    if (preco>30&&preco<=100){
      preco = preco*0.9;
    } else if (preco>100) {
      preco = preco*0.85;
    }
    System.out.println("Sua compra ficou R$"+df.format(preco));
  }
}
