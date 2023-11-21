package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");
    System.out.println("Calculo de carda: ");
    System.out.print("Digite o codigo de origem: ");
    int codO = sc.nextInt();
    System.out.print("Digite o codigo da carga: ");
    int codC = sc.nextInt();
    System.out.print("Digite o peso da carga: ");
    double peso = sc.nextDouble();
    double imp=0, preco=0, total=0;
    switch (codO){
      case 1:
        imp = 0.35;
        break;
      case 2:
        imp = 0.25;
        break;
      case 3:
        imp = 0.15;
        break;
      case 4:
        imp = 0.05;
        break;
      case 5:
        imp = 0;
        break;
    }
    if (codC>=10&&codC<=20){
      preco = 100;
    } else if (codC>=21&&codC<=30) {
      preco = 250;
    } else if (codC>=31&&codC<=40) {
      preco = 340;
    }
    double precoCarga = peso*preco;
    double impostoCarga = precoCarga*imp;
    System.out.println("O preço da carga é R$"+df.format(precoCarga));
    System.out.println("O valor do imposto é R$"+df.format(impostoCarga));
    System.out.println("O total é R$"+df.format(precoCarga+impostoCarga));
  }
}
