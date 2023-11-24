package exerciciosloiane.Aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Quantas temperaturas deseja cadastrar: ");
    int qtd = sc.nextInt();
    double temp;
    double somaTemp = 0;
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    System.out.println("\n");
    for (int i = 1; i <= qtd; i++) {
      System.out.print(i+"ª Temperatura: ");
      temp = sc.nextDouble();
      somaTemp+= temp;
      maior = (temp>maior)? temp: maior;
      menor = (temp<menor)? temp: menor;
    }
    System.out.println("\n\n*** Resultatos ***");
    System.out.println("A média das temperaturas é "+df.format(somaTemp/qtd));
    System.out.println("A maior temperatura cadastrada é "+maior);
    System.out.println("A menor temperatura cadastrada é "+menor);
  }
}
