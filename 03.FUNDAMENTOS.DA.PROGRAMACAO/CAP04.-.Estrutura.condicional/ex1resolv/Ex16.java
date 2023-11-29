package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ajuste de Preços");
    System.out.print("Digite o valor do produto R$: ");
    double valor = sc.nextDouble();
    System.out.print("Digite a quantidade de vendas: ");
    int qtd = sc.nextInt();
    double aumento;
    if (qtd<500 || valor<30){
          aumento = 1.1;
    } else if (qtd < 1200 || valor >= 30 && valor < 80) {
      aumento = 1.15;
    } else {
      aumento = 0.8;
    }
    System.out.print("O novo valor do produto será R$"+(valor*aumento));
  }
}
