package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Pedido do produto ");
    System.out.print("Digite o código do produto: ");
    int cod = sc.nextInt();
    System.out.print("Digite a qtd do produto: ");
    int qtd = sc.nextInt();

    double valorP = 0;
    if (cod >= 1 && cod <= 10) {
      valorP = 10;
    } else if (cod >= 11 && cod <= 20) {
      valorP = 15;
    } else if (cod >= 21 && cod <= 30) {
      valorP = 20;
    } else if (cod >= 31 && cod <= 40) {
      valorP = 30;
    }

    double valorC = valorP*qtd;
    double desc = 0;
    if (valorC<=250){
      desc = (double) 5 /100;
    } if (valorC>250&&valorC<=500){
      desc = (double) 10/100;
    }if (valorC>500){
      desc = (double) 15/100;
    }
    double valorDesc = valorC*desc;
    double valorN = valorC-valorDesc;
    System.out.println("Valor do Produto R$"+df.format(valorP));
    System.out.println("Valor do Pedido R$"+df.format(valorC));
    System.out.println("Valor do Desconto R$"+df.format(valorDesc));
    System.out.println("Valor da Nota R$"+df.format(valorN));
  }
}
