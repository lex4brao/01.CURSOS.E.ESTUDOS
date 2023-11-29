package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Qual tipo de investimento deseja fazer");
    System.out.println("[1] Poupança");
    System.out.println("[2] Renda fixa");
    int op = sc.nextInt();
    double porcRend = 0;
    boolean opValida = false;
    switch (op){
      case 1:
        porcRend = 0.03;
        opValida = true;
        break;
      case 2:
        porcRend = 0.04;
        opValida = true;
        break;
      default:
        System.out.println("Opção invalida");
    }
    if (opValida){
      System.out.print("Qual valor deseja investir R$ ");
      double invet = sc.nextDouble();
      double rend = invet*porcRend;
      System.out.println("Seu investimento renderá R$"+df.format(rend));
      System.out.println("O valor corrigido será R$"+df.format(rend+invet));
    }

  }
}
