package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();
    int voto, cand1 = 0, cand2=0;
    int cand3=0, cand4=0, branco = 0, nulo = 0;

    for (int i = 1; i <=qtd; i++) {
        voto = rand.nextInt(6)+1;
        cand1 = (voto==1)?(cand1+1):cand1;
        cand2 = (voto==2)?(cand2+1):cand2;
        cand3 = (voto==3)?(cand3+1):cand3;
        cand4 = (voto==4)?(cand4+1):cand4;
        branco = (voto==5)?(branco+1):branco;
        nulo = (voto==6)?(nulo+1):nulo;

        System.out.println("Voto: \t"+voto);
    }

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Oxaguian = " + cand1);
    System.out.println("Ogum = " + cand2);
    System.out.println("Exu = " + cand3);
    System.out.println("Xeroke = " + cand4);
    System.out.println();
    System.out.println();
    System.out.println("branco = " + branco);
    System.out.println("nulo = " + nulo);


  }
}
