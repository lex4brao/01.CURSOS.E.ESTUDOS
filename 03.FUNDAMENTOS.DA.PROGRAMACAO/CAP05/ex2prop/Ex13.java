package CAP05.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();
    int id;
    double peso;
    int cont1=0, cont2=0, cont3 = 0, cont4=0;

    for (int i = 1; i <= qtd; i++) {
      id = rand.nextInt(40)+1;
      peso = rand.nextDouble(150)+1;
    //  System.out.println("id = " + id);
      cont1 = (id<=10)?(cont1+1): cont1;
      cont2 = (id>10&&id<=20)?(cont2+1): cont2;
      cont3 = (id>20&&id<=30)?(cont3+1): cont3;
      cont4 = (id>30)?(cont4+1): cont4;
    }
    //cont1 = (cont1/qtd)*100;
    //cont2 = (cont2/qtd)*100;
    //cont3 = (cont3/qtd)*100;
    //cont4 = (cont4/qtd)*100;

    System.out.println("cont1 = " + cont1);
    System.out.println("cont2 = " + cont2);
    System.out.println("cont3 = " + cont3);
    System.out.println("cont4 = " + cont4);


  }
}
