package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");

    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();

    int id;
    double alt;
    double medAlt=0;

    for (int i = 1; i <=qtd; i++) {
      id = rand.nextInt(70)+10;
      alt = rand.nextDouble()*0.6+1.5;
      medAlt +=alt;

      System.out.println(i+"ª Pessoa: \t"+id+"\t "+df.format(alt));

    }
    medAlt = medAlt/qtd;

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("medAlt = " + medAlt);

  }
}
