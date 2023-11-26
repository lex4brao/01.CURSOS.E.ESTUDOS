package CAP05.ex2prop;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas compras deseja cadastrar: ");
    int qtd = sc.nextInt();
    String cod;
    double valor;
    double totVV=0, totVP=0, tot=0;
    for (int i = 1; i <=qtd ; i++) {
      System.out.println();
      System.out.print("Digite [V] à Vista ou [P] à prazo: ");
      cod = sc.next();
      System.out.print("Valor da compra R$: ");
      valor = sc.nextDouble();
      tot+= valor;
      totVV = (cod.equalsIgnoreCase("v"))?(totVV+valor): totVV;
      totVP = (cod.equalsIgnoreCase("p"))?(totVP+valor): totVP;

    }
    System.out.println();
    System.out.println();
    System.out.println("Total comprar R$"+tot);
    System.out.println("Compras à vista R$"+totVV);
    System.out.println("Compras à prazo R$"+totVP);
    System.out.println("Valor da primeira parcela R$"+(totVP/3));

  }
}
