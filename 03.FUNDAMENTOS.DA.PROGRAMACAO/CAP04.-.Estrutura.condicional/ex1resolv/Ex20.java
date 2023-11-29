package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Compra de produto ");
    System.out.println("Digite o código de origem do produto: ");
    int codOrigem = sc.nextInt();
    System.out.println("Digite o codigo do produto: ");
    int codProd = sc.nextInt();
    System.out.println("Digite o peso do produto (Kg): ");
    double peso = sc.nextDouble();
    double pesoG = peso*1000;
    double precoProd = 0;
    if (codProd>=1&&codProd<=4){
      precoProd = pesoG*10;
    } else if (codProd>=5&&codProd<=7) {
      precoProd = pesoG*25;
    } else if (codProd>=8&codProd<=10) {
      precoProd = pesoG*35;
    }
    double imposto=0;
    if (codOrigem==1){
      imposto = 0;
    } else if (codOrigem==2) {
      imposto = precoProd*0.15;
    } else if (codOrigem==3) {
      imposto = precoProd*0.25;
    }
    double totalCompra = precoProd+imposto;
    System.out.println("Voce irá comprar "+pesoG+" Gramas");
    System.out.println("Valor do Produto R$"+df.format(precoProd));
    System.out.println("Valor do imposto R$"+df.format(imposto));
    System.out.println("Total da compra R$"+df.format(totalCompra));

  }
}
