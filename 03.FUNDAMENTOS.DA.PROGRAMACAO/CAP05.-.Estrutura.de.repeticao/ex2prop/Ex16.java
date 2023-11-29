package CAP05.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();
    int id;
    double medId = 0;
    for (int i = 1; i <=qtd ; i++) {
      id= rand.nextInt(70)+10;
      medId += id;
      System.out.println(i+"ª idade: "+id);
    }
    medId = medId/qtd;
    System.out.println();
    System.out.println("A média das idades é "+medId);
  }
}
